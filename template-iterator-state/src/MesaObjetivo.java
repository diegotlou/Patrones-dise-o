/*
* @author Diego Martine Calzada
* clase MesaObjetivo clase que representa la mesa a 
* atender
*/

public class MesaObjetivo{
  private int distanciaAMesa;

  /*
  * Constructor con parametros de MesaObjetivo
  * @param distanciaAMesa - int que representa la 
  * distancia a la mesa
  */
  public MesaObjetivo(int distanciaAMesa){
    this.distanciaAMesa = distanciaAMesa;
  }

  /*
  * Metodo getDistancia
  * @return int - regresa distanciaAMesa
  */
  public int getDistancia(){
		return distanciaAMesa;
	}

  /*
  * Metodo setDistancia establece una distanciaAMesa
  * @param distanciaAMesa - int que representa la 
  * distancia a la mesa
  */
  public void setDistancia(int distanciaAMesa){
		this.distanciaAMesa = distanciaAMesa;
	}
}