/**
* Clase Arpones que extiende de Arma
* @author: Diego Martinez Calzada
*/

public class Arpones extends Arma{
  
  @Override
  public String nombre(){
    return "Arpones";
  }

  @Override
  public int ataque(){
    return 12;
  }

  @Override
  public int defensa(){
    return 0;
  }

  @Override
  public int velocidad(){
    return 0;
  }

  @Override
  public double costo(){
    return 1000.0;
  }
}