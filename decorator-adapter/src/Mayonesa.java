/**
* Clase Mayonesa que extiende de Ingredientes
* @author: Diego Martinez Calzada
*/

public class Mayonesa extends Ingredientes{
  
  /**
  * Constructor con parametros de Mayonesa
  * usando el constructor con parametros de 
  * Ingredientes
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de 
  * Mayonesa
  */
  public Mayonesa(Baguette centro, int c){
    super(centro, c);
  }

  @Override
  public String getDescripcion(){
    double precio = c*2.5;
    String aux = "";
    if(c >= 1){
      for(int i = 1; i <= c ; i++){
        aux = aux + "Mayonesa, ";
      }
    }else{
      return aux;
    }
    return b.getDescripcion() + "\n - Mayonesa: " + aux + " precio: " + precio;
  }

  @Override
  public int getCantidadMayonesa(){
    return b.getCantidadMayonesa() + c;
  }

  @Override
  public double getPrecio(){
    return b.getPrecio() + c*2.5;
  }
}