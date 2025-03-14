/**
* Interface Pieza
* @author: Diego Martinez Calzada
*/

public interface Pieza{

  /**
  * Metodo que regresa el nombre de la pieza
  * @return String - representa el nombre de la pieza
  */
  public String nombre();

  /**
  * Metodo que regresa el ataque de la pieza
  * @return int - representa el ataque de la pieza
  */
  public int ataque();

  /**
  * Metodo que regresa la defensa de la pieza
  * @return int - representa la defensa de la pieza
  */
  public int defensa();

  /**
  * Metodo que regresa la velocidad de la pieza
  * @return int - representa la velocidad de la pieza
  */
  public int velocidad();

  /**
  * Metodo que regresa el precio de la pieza
  * @return double - representa el precio de la pieza
  */
  public double costo();
  
}