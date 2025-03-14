/**
* Clase Casual que extiende de Carroceria
* @author: Diego Martinez Calzada
*/

public class Casual extends Carroceria{
  @Override
  public String nombre(){
    return "Carroceria Casual";
  }

  @Override
  public int ataque(){
    return 0;
  }

  @Override
  public int defensa(){
    return 5;
  }

  @Override
  public int velocidad(){
    return 1;
  }

  @Override
  public double costo(){
    return 500.0;
  }
}