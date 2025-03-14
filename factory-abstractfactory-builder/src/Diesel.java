/**
* Clase Diesel que extiende de Motor
* @author: Diego Martinez Calzada
*/

public class Diesel extends Motor{
  @Override
  public String nombre(){
    return "Motor Diesel";
  }

  @Override
  public int ataque(){
    return 0;
  }

  @Override
  public int defensa(){
    return 0;
  }

  @Override
  public int velocidad(){
    return 6;
  }

  @Override
  public double costo(){
    return 110.0;
  }
}