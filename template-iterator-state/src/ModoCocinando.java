/*
* @author Diego Martine Calzada
* clase ModoCocinando que implementa EstadoChefsito, el 
* estado cocinando del Chefsito 
*/

public class ModoCocinando implements EstadoChefsito{

  Chefsito chefsito;

  /*
  * Metodo contructor ModoCocinando con parametros 
  * @param chefsito - Chefsito
  */
  public ModoCocinando(Chefsito chefsito){
    this.chefsito = chefsito;
  }

  @Override
  public void activar(){
    System.out.println("***MODO COCINANDO***\nCHEFSITO ya esta activado.");
  }

  @Override
  public void caminar(){
    System.out.println("***MODO COCINANDO***\nCHEFSITO no puede caminar en MODO COCINANDO.");
  }

  @Override
  public void atender(){
    System.out.println("***MODO COCINANDO***\nCHEFSITO no puede atender en MODO COCINANDO.");
  }
  
  @Override
  public void cocinar(){
    if(!chefsito.getPlatilloTerminado()){
      Hamburguesa h = chefsito.getOrdenPlatillo(chefsito.getId());
      chefsito.cocinarH(h);
      chefsito.setPlatilloTerminado();
      System.out.println("Termine de cocinar la hamburguesa: " + h.getNombre() + " con ID: " + h.getId() + " y precio: " + h.getPrecio() + "\n");
    }else{
      System.out.println("CHEFSITO ya termino de cocinar, tiene que pasar a MODO ENTREGANDO");
    }
  }
  
  @Override
  public void entregar(){
    if(chefsito.getPlatilloTerminado()){
      System.out.println("***MODO COCINANDO***\nCHEFSITO ha terminado de cocinar y pasara a MODO ENTREGANDO");
      chefsito.asignarNuevoEstado(chefsito.getEstadoEntregando());  
    }else{
      System.out.println("***MODO COCINANDO***\nCHEFSITO no puede entregar si aun no cocina");
    }
  }
  
  @Override
  public void apagarse(){
    System.out.println("***MODO COCINANDO***\nCHEFSITO no puede suspenderse en MODO COCINANDO.");
  }
}