/**
* Clase que adapta PizzasDonCangrejo
* @author: Diego Martinez Calzada
*/

public class AdapterPizzasDC implements Cadena{
  private PizzaDonCangrejo p;

  /**
  * Constructor con parametros
  * @param p -- PizzaDonCangrejo pizza que se va a 
  * adaptar para imprimir su ticket
  */
  public AdapterPizzasDC(PizzaDonCangrejo p){
    this.p = p;
  }
  
  @Override
  public void imprimirTicket(){
    System.out.println("*** Ticket *** \n" + " - Carne: " + p.getCarne() + "\n - Queso: " + p.getQueso() + "\n - Masa: " + p.getMasa() + "\n Total: " + p.getPrecio());
  }
}