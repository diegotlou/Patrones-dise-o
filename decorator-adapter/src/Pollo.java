/**
* Clase Pollo que extiende de Ingredientes
* @author: Diego Martinez Calzada
*/

public class Pollo extends Ingredientes{
  
  /**
  * Constructor con parametros de Pollo
  * usando el constructor con parametros de 
  * Ingredientes
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de 
  * Pollo
  */
  public Pollo(Baguette centro, int c){
    super(centro, c);
  }

  @Override
  public String getDescripcion(){
    double precio = c*5.0;
    String aux = "";
    if(c >= 1){
      for(int i = 1; i <= c ; i++){
        aux = aux + "Pollo, ";
      }
    }else{
      return aux;
    }

    return b.getDescripcion() + "\n - Pollo: " + aux + " precio: " + precio;
  }

  @Override
  public int getCantidadPollo(){
    return b.getCantidadPollo() + c;
  }

  @Override
  public double getPrecio(){
    return b.getPrecio() + c*5.0;
  }
}