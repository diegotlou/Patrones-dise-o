/**
* Clase Cebolla que extiende de Ingredientes
* @author: Diego Martinez Calzada
*/

public class Cebolla extends Ingredientes{
  
  /**
  * Constructor con parametros de Cebolla
  * usando el constructor con parametros de 
  * Ingredientes
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de 
  * Cebolla
  */
  public Cebolla(Baguette centro, int c){
    super(centro, c);
  }

  @Override
  public String getDescripcion(){
    double precio = c*0.5;
    String aux = "";
    if(c >= 1){
      for(int i = 1; i <= c ; i++){
        aux = aux + "Cebolla, ";
      }
    }else{
      return aux;
    }
    return b.getDescripcion() + "\n - Cebolla: " + aux + " precio: " + precio;
  }

  @Override
  public int getCantidadCebolla(){
    return b.getCantidadCebolla() + c;
  }

  @Override
  public double getPrecio(){
    return b.getPrecio() + c*0.5;
  }
}