/*
* @author Diego Martine Calzada
* clase ModoApagado que implementa EstadoChefsito, el 
* estado apagado del Chefsito 
*/

public class ModoApagado implements EstadoChefsito{

  Chefsito chefsito;

  /*
  * Metodo contructor ModoApago con parametros 
  * @para chefsito - Chefsito
  */
  public ModoApagado(Chefsito chefsito){
    this.chefsito = chefsito;
  }

  @Override
  public void activar(){
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado() && chefsito.getApagarse()){
      System.out.println("***MODO APAGADO***\nCHEFSITO ha terminado sus horas de trabajo.");
    }else{
      //chefsito.ingresarMesa();
      System.out.println("***MODO APAGADO***\nCHEFSITO se volvera a activar.");
      chefsito.asignarNuevoEstado(chefsito.getEstadoSuspendido());
    }
  }

  @Override
  public void caminar(){
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado() && chefsito.getApagarse()){
			System.out.println("***MODO APAGADO***\nCHEFSITO ha terminado su trabajo por hoy.");
		} else {
			System.out.println("***MODO APAGADO***\nCHEFSITO no puede caminar mientras esta apagado.");
		}
  }

  @Override
  public void atender(){
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado() && chefsito.getApagarse()){
			System.out.println("***MODO APAGADO***\nCHEFSITO ha terminado su trabajo por hoy.");
		} else {
			System.out.println("***MODO APAGADO***\nCHEFSITO no puede antender mientras esta apagado.");
		}
  }
  
  @Override
  public void cocinar(){
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado() && chefsito.getApagarse()){
			System.out.println("***MODO APAGADO***\nCHEFSITO ha terminado su trabajo por hoy.");
		} else {
			System.out.println("***MODO APAGADO***\nCHEFSITO no puede cocinar mientras esta apagado.");
		}
  }
  
  @Override
  public void entregar(){
    if(chefsito.getMesaRecibida() && chefsito.getMesaCorrecta() && chefsito.getPlatilloEntregado() && chefsito.getApagarse()){
			System.out.println("***MODO APAGADO***\nCHEFSITO ha terminado su trabajo por hoy.");
		} else {
			System.out.println("***MODO APAGADO***\nCHEFSITO no puede entregar mientras esta apagado.");
		}
  }
  
  @Override
  public void apagarse(){
    System.out.println("***MODO APAGADO***\nCHEFSITO ya esta APAGADO.");
  }
}