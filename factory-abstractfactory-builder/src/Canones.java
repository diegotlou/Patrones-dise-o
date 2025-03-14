/**
* Clase Lanzallamas que extiende de Arma
* @author: Diego Martinez Calzada
*/

public class Canones extends Arma{
  
  @Override
  public String nombre(){
    return "Canones";
  }

  @Override
  public int ataque(){
    return 25;
  }

  @Override
  public int defensa(){
    return 3;
  }

  @Override
  public int velocidad(){
    return -1;
  }

  @Override
  public double costo(){
    return 1350.0;
  }
}