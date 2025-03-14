/**
* Clase Simples que extiende de Llanta
* @author: Diego Martinez Calzada
*/

public class Simples extends Llanta{
  @Override
  public String nombre(){
    return "Llanta Simple";
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
    return 2;
  }

  @Override
  public double costo(){
    return 20.0;
  }
}