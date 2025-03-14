/*
* @author Diego Martine Calzada
* clase ModoEntregando que implementa EstadoChefsito,
* estado cuando entrega el platillo ya cocinado
*/

public class ModoEntregando implements EstadoChefsito{

  Chefsito chefsito;

  /*
  * Metodo contructor ModoEntregando con parametros 
  * @param chefsito - Chefsito
  */
  public ModoEntregando(Chefsito chefsito){
    this.chefsito = chefsito;
  }

  @Override
  public void activar(){
    System.out.println("***MODO ENTREGANDO***\nCHEFSITO ya esta activo.");
  }

  @Override
  public void caminar(){
    System.out.println("***MODO ENTREGANDO***\nCHEFSITO no puede caminar mientras esta entregando.");
  }

  @Override
  public void atender(){
    if(chefsito.getPlatilloEntregado()){
      System.out.println("***MODO ENTREGANDO***\nCHEFSITO pasara a MODO ATENDIENDO, para tomarte otra orden.");
      chefsito.atenderEntregando();
      chefsito.asignarNuevoEstado(chefsito.getEstadoAtendiendo());
    }else{
      System.out.println("***MODO ENTREGANDO***\nCHEFSITO no puede atender de nuevo si no ha entregado.");
    }
  }
  
  @Override
  public void cocinar(){
    System.out.println("***MODO ENTREGANDO***\nCHEFSITO ya termino de cocinar.");
  }
  
  @Override
  public void entregar(){
    if(chefsito.getPlatilloEntregado()){
      System.out.println("***MODO ENTREGANDO***\nCHEFSITO ya entrego la hamburguesa.");
    }else{
      System.out.println("***MODO ENTREGANDO***\nTenga su platillo :)");
      chefsito.setPlatilloEntregado();
    }
  }
  
  @Override
  public void apagarse(){
    if(chefsito.getPlatilloEntregado()){
      System.out.println("***MODO ENTREGANDO***\nCHEFSITO pasara a MODO SUSPENDIDO");
      chefsito.asignarNuevoEstado(chefsito.getEstadoSuspendido());
    }else{
      System.out.println("***MODO ENTREGANDO***\nNo puede suspenderse si no ha entregado el platillo");
    }
  }
}