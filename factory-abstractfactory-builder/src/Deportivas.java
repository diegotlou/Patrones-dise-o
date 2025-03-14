/**
* Clase Deportivas que extiende de Llanta
* @author: Diego Martinez Calzada
*/

public class Deportivas extends Llanta{
  @Override
  public String nombre(){
    return "Llantas Deportivas";
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
    return 100.0;
  }
}