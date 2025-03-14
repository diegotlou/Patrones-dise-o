/**
* Clase Camion que extiende de Carroceria
* @author: Diego Martinez Calzada
*/

public class Camion extends Carroceria{
  
  @Override
  public String nombre(){
    return "Carroceria Camion";
  }

  @Override
  public int ataque(){
    return 0;
  }

  @Override
  public int defensa(){
    return 8;
  }

  @Override
  public int velocidad(){
    return -2;
  }

  @Override
  public double costo(){
    return 850.0;
  }
}