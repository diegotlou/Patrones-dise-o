/**
* Clase Deportiva que extiende de Carroceria
* @author: Diego Martinez Calzada
*/

public class Deportiva extends Carroceria{
  @Override
  public String nombre(){
    return "Carroceria Deportiva";
  }

  @Override
  public int ataque(){
    return 0;
  }

  @Override
  public int defensa(){
    return 4;
  }

  @Override
  public int velocidad(){
    return 3;
  }

  @Override
  public double costo(){
    return 620.0;
  }
}