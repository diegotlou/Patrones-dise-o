/**
* Clase OrugaTanque que extiende de Llanta
* @author: Diego Martinez Calzada
*/

public class OrugaTanque extends Llanta{
  @Override
  public String nombre(){
    return "Llanta oruga de tanque";
  }

  @Override
  public int ataque(){
    return 0;
  }

  @Override
  public int defensa(){
    return 5;
  }

  @Override
  public int velocidad(){
    return 2;
  }

  @Override
  public double costo(){
    return 120.0;
  }
}