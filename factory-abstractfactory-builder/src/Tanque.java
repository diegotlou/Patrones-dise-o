/**
* Clase Tanque que extiende de Blindaje
* @author: Diego Martinez Calzada
*/

public class Tanque extends Blindaje{
  @Override
  public String nombre(){
    return "Blindaje Tanque";
  }

  @Override
  public int ataque(){
    return 0;
  }

  @Override
  public int defensa(){
    return 10;
  }

  @Override
  public int velocidad(){
    return -5;
  }

  @Override
  public double costo(){
    return 500.0;
  }
}