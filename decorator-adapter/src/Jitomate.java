/**
* Clase Jitomate que extiende de Ingredientes
* @author: Diego Martinez Calzada
*/

public class Jitomate extends Ingredientes{
  
  /**
  * Constructor con parametros de Jitomate
  * usando el constructor con parametros de 
  * Ingredientes
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de 
  * Jitomate
  */
  public Jitomate(Baguette centro, int c){
    super(centro, c);
  }

  @Override
  public String getDescripcion(){
    double precio = c*1.0;
    String aux = "";
    if(c >= 1){
      for(int i = 1; i <= c ; i++){
        aux = aux + "Jitomate, ";
      }
    }else{
      return aux;
    }
    return b.getDescripcion() + "\n - Jitomate: " + aux + " precio: " + precio;
  }

  @Override
  public int getCantidadJitomate(){
    return b.getCantidadJitomate() + c;
  }

  @Override
  public double getPrecio(){
    return b.getPrecio() + c*1.0;
  }
}