/**
* Clase Lechuga que extiende de Ingredientes
* @author: Diego Martinez Calzada
*/

public class Lechuga extends Ingredientes{
  
  /**
  * Constructor con parametros de Lechuga
  * usando el constructor con parametros de 
  * Ingredientes
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de 
  * Lechuga
  */
  public Lechuga(Baguette centro, int c){
    super(centro, c);
  }

  @Override
  public String getDescripcion(){
    double precio = c*1.0;
    String aux = "";
    if(c >= 1){
      for(int i = 1; i <= c ; i++){
        aux = aux + "Lechuga, ";
      }
    }else{
      return aux;
    }
    return b.getDescripcion() + "\n - Lechuga: " + aux + " precio: " + precio;
  }

  @Override
  public int getCantidadLechuga(){
    return b.getCantidadLechuga() + c;
  }

  @Override
  public double getPrecio(){
    return b.getPrecio() + c*1.0;
  }
}