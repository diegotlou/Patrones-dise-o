/**
* Clase Turbo que extiende de Motor
* @author: Diego Martinez Calzada
*/

public class Turbo extends Motor{
  @Override
  public String nombre(){
    return "Motor Turbo";
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
    return 15;
  }

  @Override
  public double costo(){
    return 200.0;
  }
}