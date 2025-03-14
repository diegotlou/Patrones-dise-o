/**
* Clase abstarcta Motor que implementa a Pieza
* @author: Diego Martinez Calzada
*/

public abstract class Motor implements Pieza{
  
  @Override
  public abstract String nombre();

  @Override
  public abstract int ataque();

  @Override
  public abstract int defensa();

  @Override
  public abstract int velocidad();

  @Override
  public abstract double costo();
}