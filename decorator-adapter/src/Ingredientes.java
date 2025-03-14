/**
* Clase abstracta Ingredientes que implementa, 
* Baguette representa
* @author: Diego Martinez Calzada
*/

public abstract class Ingredientes implements Baguette{
  protected Baguette b;
  protected int c;

  /**
  * Metodo constructor de Ingredientes con  
  * parametros
  * @param centro -- Baguette
  * @param c -- int que representa la cantidad de un
  * Ingrediente
  */
  public Ingredientes(Baguette centro, int c){
    b = centro;
    this.c = c;
  }

  @Override
  public double getPrecioPan(){
    return b.getPrecioPan();
  }

  @Override
  public String getDescripcion(){
    return b.getDescripcion();
  }
  
  @Override
  public int getCantidadPollo(){
    return b.getCantidadPollo();
  }

  @Override
  public int getCantidadPepperoni(){
    return b.getCantidadPepperoni();
  }

  @Override
  public int getCantidadJamon(){
    return b.getCantidadJamon();
  }

  @Override
  public int getCantidadLechuga(){
    return b.getCantidadLechuga();
  }

  @Override
  public int getCantidadJitomate(){
    return b.getCantidadJitomate();
  }

  @Override
  public int getCantidadCebolla(){
    return b.getCantidadCebolla();
  }

  @Override
  public int getCantidadMostaza(){
    return b.getCantidadMostaza();
  }

  @Override
  public int getCantidadCatsup(){
    return b.getCantidadCatsup();
  }

  @Override
  public int getCantidadMayonesa(){
    return b.getCantidadMayonesa();
  }

  @Override
  public double getPrecio(){
    return b.getPrecio();
  }
}