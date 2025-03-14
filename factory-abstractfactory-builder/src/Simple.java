/**
* Clase Simple que extiende de Blindaje
* @author: Diego Martinez Calzada
*/

public class Simple extends Blindaje{
  @Override
  public String nombre(){
    return "Blindaje Simple";
  }

  @Override
  public int ataque(){
    return 0;
  }

  @Override
  public int defensa(){
    return 3;
  }

  @Override
  public int velocidad(){
    return 0;
  }

  @Override
  public double costo(){
    return 120.0;
  }
}