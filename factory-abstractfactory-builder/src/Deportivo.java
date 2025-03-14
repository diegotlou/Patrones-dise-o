/**
* Clase Deportivo que extiende de Motor
* @author: Diego Martinez Calzada
*/

public class Deportivo extends Motor{
  @Override
  public String nombre(){
    return "Motor Deportivo";
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
    return 10;
  }

  @Override
  public double costo(){
    return 150.0;
  }
}