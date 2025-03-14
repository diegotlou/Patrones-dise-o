/**
* Clase Metralleta que extiende de Arma
* @author: Diego Martinez Calzada
*/

public class Metralleta extends Arma{
  @Override
  public String nombre(){
    return "Metralleta";
  }

  @Override
  public int ataque(){
    return 20;
  }

  @Override
  public int defensa(){
    return 2;
  }

  @Override
  public int velocidad(){
    return 0;
  }

  @Override
  public double costo(){
    return 1500.0;
  }
}