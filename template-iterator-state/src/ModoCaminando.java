/*
* @author Diego Martine Calzada
* clase ModoCaminando que implementa EstadoChefsito, el 
* estado caminando del Chefsito 
*/

public class ModoCaminando implements EstadoChefsito{

  Chefsito chefsito;

  /*
  * Metodo contructor ModoCaminando con parametros 
  * @param chefsito - Chefsito
  */
  public ModoCaminando(Chefsito chefsito){
    this.chefsito = chefsito;
  }

  @Override
  public void activar(){
    System.out.println("***MODO MOVIMIENTO***\nCHEFSITO ya esta activado.");
  }

  @Override
  public void caminar(){
    if(!chefsito.getMesaCorrecta()){
      chefsito.reducirDistancia();
      System.out.println("***MODO CAMINANDO***\nCHEFSITO se esta acercando a la mesa.");
    }else{
      System.out.println("***MODO CAMINANDO***\nCHEFSITO ha llegado a tu mesa.");
    }
  }

  @Override
  public void atender(){
    if(!chefsito.getMesaCorrecta()){
      System.out.println("***MODO CAMINANDO***\nCHEFSITO no ha llegado a la mesa.");
    }else{
      System.out.println("***MODO CAMINANDO***\nCHEFSITO pasara a MODO ATENDIENDO.");
      chefsito.asignarNuevoEstado(chefsito.getEstadoAtendiendo());
    }
  }
  
  @Override
  public void cocinar(){
    System.out.println("***MODO CAMINANDO***\nCHEFSITO no puede cocinar antes de atender.");
  }
  
  @Override
  public void entregar(){
    System.out.println("***MODO CAMINANDO***\nCHEFSITO no puede entregar antes de atender.");
  }
  
  @Override
  public void apagarse(){
    System.out.println("***MODO CAMINANDO***\nCHEFSITO pasara a MODO SUSPENDIDO.");
    chefsito.asignarNuevoEstado(chefsito.getEstadoSuspendido());
  }
}