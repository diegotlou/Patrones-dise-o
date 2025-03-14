/*
* @author Diego Martine Calzada
* clase ModoSuspendido que implementa EstadoChefsito, 
* estado suspendido del Chefsito 
*/

public class ModoSuspendido implements EstadoChefsito{

  Chefsito chefsito;

  /*
  * Metodo contructor ModoSuspendido con parametros 
  * @param chefsito - Chefsito
  */
  public ModoSuspendido(Chefsito chefsito){
    this.chefsito = chefsito;
  }

  @Override
  public void activar(){
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado()){
      chefsito.volverAAtender();
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO ha sido activado.");
      chefsito.ingresarMesa();
    }else{
      chefsito.ingresarMesa();
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO ha sido activado.");
    }
  }

  @Override
  public void caminar(){
    if(chefsito.getMesaRecibida()){
      if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado()){
        chefsito.volverAAtender();
        System.out.println("***MODO SUSPENDIDO***\nCHEFSITO pasara a MODO CAMINANDO.");
      }else{
        System.out.println("***MODO SUSPENDIDO***\nCHEFSITO pasara a MODO CAMINANDO.");
        chefsito.asignarNuevoEstado(chefsito.getEstadoCaminando());
      }
    }else{
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO no ha sido activado.");
    }
  }

  @Override
  public void atender(){
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado()){
      chefsito.volverAAtender();
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO no puede antender lejos de la mesa.");
    }else{
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO no puede antender lejos de la mesa.");
    }
  }
  
  @Override
  public void cocinar(){
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado()){
      chefsito.volverAAtender();
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO no puede cocinar lejos de la mesa.");
    }else{
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO no puede cocinar lejos de la mesa.");
    }
  }
  
  @Override
  public void entregar(){
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado()){
      chefsito.volverAAtender();
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO no puede antender lejos de la mesa.");
    }else{
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO no puede antender lejos de la mesa.");
    }
  }
  
  @Override
  public void apagarse(){
    chefsito.seApaga();;
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado() && chefsito.getApagarse()){
      chefsito.volverAAtender();
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO ha terminado por hoy. Pasara a MODO APAGADO.");
      chefsito.asignarNuevoEstado(chefsito.getEstadoApagado());
    }else{
      System.out.println("***MODO SUSPENDIDO***\nCHEFSITO pasara a MODO APAGADO.");
      chefsito.asignarNuevoEstado(chefsito.getEstadoApagado());
    }
  }
}