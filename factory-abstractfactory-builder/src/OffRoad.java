/**
* Clase OffRoad que extiende de Llanta
* @author: Diego Martinez Calzada
*/

public class OffRoad extends Llanta{
  @Override
  public String nombre(){
    return "Llanta Off-Road";
  }

  @Override
  public int ataque(){
    return 0;
  }

  @Override
  public int defensa(){
    return 1;
  }

  @Override
  public int velocidad(){
    return 3;
  }

  @Override
  public double costo(){
    return 80.0;
  }
}