/**
* Clase BaguetteWS que implementa Cadena y que imprime 
* el ticket de una Baguette
* @author: Diego Martinez Calzada
*/

public class BaguetteWS implements Cadena{
  private Baguette b;

  /**
  * Constructor con parametros
  * @param b -- Baguette baguette que se va a 
  * imprimir su ticket
  */
  public BaguetteWS(Baguette b){
    this.b = b;
  }

  @Override
  public void imprimirTicket(){
    System.out.println("*** Ticket *** \n" + b.getDescripcion() + "\n Total: " + b.getPrecio());
  }
}