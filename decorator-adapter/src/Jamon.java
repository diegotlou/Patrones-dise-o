/**
* Clase Jamon que extiende de Ingredientes
* @author: Diego Martinez Calzada
*/

public class Jamon extends Ingredientes{
  
  /**
  * Constructor con parametros de Jamon
  * usando el constructor con parametros de 
  * Ingredientes
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de 
  * Jitomate
  */
  public Jamon(Baguette centro, int c){
    super(centro, c);
  }

  @Override
  public String getDescripcion(){
    double precio = c*3.0;
    String aux = "";
    if(c >= 1){
      for(int i = 1; i <= c ; i++){
        aux = aux + "Jamon, ";
      }
    }else{
      return aux;
    }
    return b.getDescripcion() + "\n - Jamon: " + aux + " precio: " + precio;
  }

  @Override
  public int getCantidadJamon(){
    return b.getCantidadJamon() + c;
  }

  @Override
  public double getPrecio(){
    return b.getPrecio() + c*3.0;
  }
}