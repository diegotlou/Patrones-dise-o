/**
* Clase Mostaza que extiende de Ingredientes
* @author: Diego Martinez Calzada
*/

public class Mostaza extends Ingredientes{
  
  /**
  * Constructor con parametros de Mostaza
  * usando el constructor con parametros de 
  * Ingredientes
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de 
  * Mostaza
  */
  public Mostaza(Baguette centro, int c){
    super(centro, c);
  }

  @Override
  public String getDescripcion(){
    double precio = c*1.5;
    String aux = "";
    if(c >= 1){
      for(int i = 1; i <= c ; i++){
        aux = aux + "Mostaza, ";
      }
    }else{
      return aux;
    }
    return b.getDescripcion() + "\n - Mostaza: " + aux + " precio: " + precio;
  }

  @Override
  public int getCantidadMostaza(){
    return b.getCantidadMostaza() + c;
  }

  @Override
  public double getPrecio(){
    return b.getPrecio() + c*1.5;
  }
}