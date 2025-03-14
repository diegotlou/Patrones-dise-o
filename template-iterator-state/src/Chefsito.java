/*
* @author Diego Martine Calzada
* clase para el Chefsito
*/

import java.util.Iterator;

public class Chefsito implements EstadoChefsito{
  private boolean mesaRecibida;
  private MesaObjetivo mesaObjetivo;
  private boolean mesaCorrecta;
  private boolean platilloTerminado;
  private boolean platilloEntregado;
  private boolean apagarse;
  private String id;
  private boolean ordenPlatilloRecibido;
  private EstadoChefsito estadoActual;
  private EstadoChefsito modoApagado;
  private EstadoChefsito modoSuspendido;
  private EstadoChefsito modoCaminando;
  private EstadoChefsito modoAtendiendo;
  private EstadoChefsito modoCocinando;
  private EstadoChefsito modoEntregando;
  private Lector lector;
  private Coccion procesoCoccion;

  /*
  * Metodo constructor de un Chefsito sin parametros
  */
  public Chefsito(){
    mesaRecibida = false;
    mesaCorrecta = false;
    platilloTerminado = false;
    platilloEntregado = false;
    apagarse = false;
    id = "";
    ordenPlatilloRecibido = false;
    modoApagado = new ModoApagado(this);
    modoSuspendido = new ModoSuspendido(this);
    modoCaminando = new ModoCaminando(this);
    modoAtendiendo = new ModoAtendiendo(this);
    modoCocinando = new ModoCocinando(this);
    modoEntregando = new ModoEntregando(this);
    estadoActual = modoSuspendido;
    lector = new Lector();
  }

  /*
  * Metodo ingresarMesa, crea mesa y llama a 
  * recibirMesaObjetivo
  */
  public void ingresarMesa(){
    System.out.println("Recibiendo orden remota ...");
    MesaObjetivo mesa = new MesaObjetivo(3);
    recibirMesaObjetivo(mesa);
    System.out.println("Orden recibida");
  }

  /*
  * Metodo recibirMesaObjetivo, recibe la mesa a la que
  * quiere llegar
  * @param mesa - MesaObjetivo
  */
  public void recibirMesaObjetivo(MesaObjetivo mesa){
    mesaObjetivo = mesa;
    mesaRecibida = true;
  }

  /*
  * Metodo getMesaRecibida nos dice si ya recibio una 
  * mesa
  * @return boolean - regresa mesaRecibida
  */
  public boolean getMesaRecibida(){
    return mesaRecibida;
  }

  /*
  * Metodo getMesaCorrecta nos dice si esta en la 
  * mesa correcta
  * @return boolean - regresa mesaCorrecta
  */
  public boolean getMesaCorrecta(){
    if(mesaObjetivo.getDistancia() > 0){
      return mesaCorrecta;
    }else{
      mesaCorrecta = true;
      return mesaCorrecta;
    }
  }
  
  /*
  * Metodo getMesaObjetivo nos regresa la 
  * mesa objetivo
  * @return boolean - regresa mesaObjetivo
  */
  public MesaObjetivo getMesaObjetivo(){
    return mesaObjetivo;
  }

  /*
  * Metodo reducirDistancia reduce la distancia a la 
  * mesa objetivo
  */
  public void reducirDistancia(){
    mesaObjetivo.setDistancia(mesaObjetivo.getDistancia() - 1);
  }

  /*
  * Metodo getPlatilloRecibido nos dice si ya recibio
  * la Hamburguesa que quiere el cliente
  * @return boolean - ordenPlatilloRecibido
  */
  public boolean getPlatilloRecibido(){
    return ordenPlatilloRecibido;
  }

  /*
  * Metodo setPlatilloRecibido si ya recibio el 
  * platillo del cliente hace true a 
  * ordenPlatilloRecibido
  */
  public void setPlatilloRecibido(){
    ordenPlatilloRecibido = true;
  }

  /*
  * Metodo getOrdenPlatillo 
  * @param id - String es el id de la Hamburguesa que 
  * el cliente quiere
  * @return Hamburguesa - la Hamburguesa que quiere el
  * cliente
  */
  public Hamburguesa getOrdenPlatillo(String id){
    Iterador menuGeneral = lector.getIteradorMenuG();
    Iterator menuDeLujo = lector.getIteradorMenuDL();
    Iterator menuCadaDia = lector.getIteradorMenuCD();

    if(id.contains("HG")){
      while(menuGeneral.hasNext()){
        Hamburguesa h = (Hamburguesa)menuGeneral.next();
        if(h.getId().equals(id)){
          ordenPlatilloRecibido = true;
          return h;
        }
      }
    }

    if(id.contains("HCD")){
      while(menuCadaDia.hasNext()){
        Hamburguesa h = (Hamburguesa)menuCadaDia.next();
        if(h.getId().equals(id)){
          ordenPlatilloRecibido = true;
          return h;
        }
      }
    }

    if(id.contains("HDL")){
      while(menuDeLujo.hasNext()){
        Hamburguesa h = (Hamburguesa)menuDeLujo.next();
        if((h.getId().equals(id))){
          ordenPlatilloRecibido = true;
          return h;
        }
      }
    }
    System.out.println("No tenemos esa Hamburguesa D:");
    return null;
  }

  /*
  * Metodo setId asigna a id el ID de la Hamburguesa  
  * que quiere el cliente
  * @param id - String ID de la Hamburguesa 
  */
  public void setId(String id){
    this.id = id;
  }

  /*
  * Metodo getId
  * @return String - id de la Hamburguesa
  */
  public String getId(){
    return id;
  }

  /*
  * Metodo mostrarMenus imprime los menus usando sus  
  * iteradores
  */
  public void mostrarMenus(){
    Iterador menuGeneral = lector.getIteradorMenuG();
    Iterator menuDeLujo = lector.getIteradorMenuDL();
    Iterator menuCadaDia = lector.getIteradorMenuCD();

    System.out.println("*** Menu General ***");
    while(menuGeneral.hasNext()){
      System.out.println("\n" + ((Hamburguesa)menuGeneral.next()).toString());
    }

    System.out.println("*** Menu Que Cambia Cada Dia ***");
    while(menuCadaDia.hasNext()){
      System.out.println("\n" + ((Hamburguesa)menuCadaDia.next()).toString());
    }

    System.out.println("*** Menu De Lujo ***");
    while(menuDeLujo.hasNext()){
      System.out.println("\n" + ((Hamburguesa)menuDeLujo.next()).toString());
    }
  }

  /*
  * Metodo getPlatilloEntregado nos dice si ya entrego
  * la Hamburguesa que quiere el cliente
  * @return boolean - platilloEntregado
  */
  public boolean getPlatilloEntregado(){
    return platilloEntregado;
  }

  /*
  * Metodo setPlatilloRecibido hace true a 
  * platilloEntregado
  */
  public void setPlatilloEntregado(){
    platilloEntregado = true;
  }

  /*
  * Metodo cocinarH cocina la Hamburguesa que quiere el
  * cliente
  * @param h - Hamburguesa que se quiere preparar
  */
  public void cocinarH(Hamburguesa h){
    if(h.getConQueso()){
      if(h.getEsVegetariano()){
        procesoCoccion = new VegetarianaConQ();
        procesoCoccion.coccionH(h);
      }else{
        procesoCoccion = new ConQueso();
        procesoCoccion.coccionH(h);
      }
    }else{
      if(h.getEsVegetariano()){
        procesoCoccion = new Vegano();
        procesoCoccion.coccionH(h);
      }else{
        procesoCoccion = new NoVegetarianaNoQ();
        procesoCoccion.coccionH(h);
      }
    }
  }

  /*
  * Metodo setPlatilloTerminado hace true a 
  * platilloTerminado
  */
  public void setPlatilloTerminado(){
    platilloTerminado = true;
  }

  /*
  * Metodo getPlatilloTerminado nos dice si ya termino
  * la Hamburguesa que quiere el cliente
  * @return boolean - platilloTerminado
  */
  public boolean getPlatilloTerminado(){
    return platilloTerminado;
  }

  /*
  * Metodo volverAAtender, cuando vuelve a atender 
  * desde suspendido
  */
  public void volverAAtender(){
    mesaRecibida = false;
    mesaCorrecta = false;
    platilloTerminado = false;
    platilloEntregado = false;
    ordenPlatilloRecibido = false;
  }

  /*
  * Metodo atenderEntregando, cuando vuelve a atender 
  * desde entregando
  */
  public void atenderEntregando(){
    platilloTerminado = false;
    platilloEntregado = false;
    ordenPlatilloRecibido = false;
  }

  /*
  * Metodo getApagarse, regresa un boolean apagarse
  */
  public boolean getApagarse(){
    return apagarse;
  }

  /*
  * Metodo seApaga, cuando se quiere apagar el CHEFSITO
  */
  public void seApaga(){
    apagarse = true;
  }

  /*
  * Metodo asignarNuevoEstado, cuando se cambia de 
  * estado
  * @param estado - EstadoChefsito nuevo estado al que
  * se va a cambiar
  */
  public void asignarNuevoEstado(EstadoChefsito estado){
    estadoActual = estado;
  }

  @Override
  public void activar(){
    estadoActual.activar();
  }

  @Override
  public void caminar(){
    estadoActual.caminar();
  }

  @Override
  public void atender(){
    estadoActual.atender();
  }

  @Override
  public void cocinar(){
    estadoActual.cocinar();
  }

  @Override
  public void entregar(){
    estadoActual.entregar();
  }

  @Override
  public void apagarse(){
    estadoActual.apagarse();
  }

  /*
  * Metodo getEstadoSuspendido, se regresa 
  * modoSuspendido
  * @return EstadoChefsito - el modoSuspendido
  */
  public EstadoChefsito getEstadoSuspendido(){
    return modoSuspendido;
  }

  /*
  * Metodo getEstadoCaminando, se regresa 
  * modoCaminando
  * @return EstadoChefsito - el modoCaminando
  */
  public EstadoChefsito getEstadoCaminando(){
    return modoCaminando;
  }

  /*
  * Metodo getEstadoAtendiendo, se regresa 
  * modoAtendiendo
  * @return EstadoChefsito - el modoAtendiendo
  */
  public EstadoChefsito getEstadoAtendiendo(){
    return modoAtendiendo;
  }

  /*
  * Metodo getEstadoCocinando, se regresa 
  * modoCocinando
  * @return EstadoChefsito - el modoCocinando
  */
  public EstadoChefsito getEstadoCocinando(){
    return modoCocinando;
  }

  /*
  * Metodo getEstadoEntregando, se regresa 
  * modoEntregando
  * @return EstadoChefsito - el modoEntregando
  */
  public EstadoChefsito getEstadoEntregando(){
    return modoEntregando;
  }

  /*
  * Metodo getEstadoApagado, se regresa 
  * modoApagado
  * @return EstadoChefsito - el modoApagado
  */
  public EstadoChefsito getEstadoApagado(){
    return modoApagado;
  }
}