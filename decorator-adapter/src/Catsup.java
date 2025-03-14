/**
* Clase Catsup que extiende de Ingredientes
* @author: Diego Martinez Calzada
*/

public class Catsup extends Ingredientes{
  
  /**
  * Constructor con parametros de Catsup
  * usando el constructor con parametros de 
  * Ingredientes
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de 
  * Catsup
  */
  public Catsup(Baguette centro, int c){
    super(centro, c);
  }

  @Override
  public String getDescripcion(){
    double precio = c*2.0;
    String aux = "";
    if(c >= 1){
      for(int i = 1; i <= c ; i++){
        aux = aux + "Catsup, ";
      }
    }else{
      return aux;
    }
    return b.getDescripcion() + "\n - Catsup: " + aux + " precio: " + precio;
  }

  @Override
  public int getCantidadCatsup(){
    return b.getCantidadCatsup() + c;
  }

  @Override
  public double getPrecio(){
    return b.getPrecio() + c*2.0;
  }
}