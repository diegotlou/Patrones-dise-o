/**
* Clase Sierra que extiende de Arma
* @author: Diego Martinez Calzada
*/

public class Sierra extends Arma{
  @Override
  public String nombre(){
    return "Sierra";
  }

  @Override
  public int ataque(){
    return 8;
  }

  @Override
  public int defensa(){
    return 1;
  }

  @Override
  public int velocidad(){
    return 0;
  }

  @Override
  public double costo(){
    return 950.0;
  }
}