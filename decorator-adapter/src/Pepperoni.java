/**
* Clase Pepperoni que extiende de Ingredientes
* @author: Diego Martinez Calzada
*/

public class Pepperoni extends Ingredientes{
  
  /**
  * Constructor con parametros de Pepperoni
  * usando el constructor con parametros de 
  * Ingredientes
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de 
  * Pepperoni
  */
  public Pepperoni(Baguette centro, int c){
    super(centro, c);
  }

  @Override
  public String getDescripcion(){
    double precio = c*10.0;
    String aux = "";
    if(c >= 1){
      for(int i = 1; i <= c ; i++){
        aux = aux + "Pepperoni, ";
      }
    }else{
      return aux;
    }
    return b.getDescripcion() + "\n - Pepperoni: " + aux + " precio: " + precio;
  }

  @Override
  public int getCantidadPepperoni(){
    return b.getCantidadPepperoni() + c;
  }

  @Override
  public double getPrecio(){
    return b.getPrecio() + c*10.0;
  }
}