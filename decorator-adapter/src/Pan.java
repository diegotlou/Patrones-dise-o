/**
* Clase Pan que implementa Baguette y que representa 
* el nucleo del patron decorator 
* @author: Diego Martinez Calzada
*/

public class Pan implements Baguette{
  private String descripcion;
  private int cantidadPollo;
  private int cantidadPepperoni;
  private int cantidadJamon;
  private int cantidadLechuga;
  private int cantidadJitomate;
  private int cantidadCebolla;
  private int cantidadMostaza;
  private int cantidadCatsup;
  private int cantidadMayonesa;
  private double precio;
  private double precioPan;

  /**
  * Constructor con parametros de Pan
  * @param precio - double que representa el precio 
  * del pan (precioPan) que tambien es el precio, el 
  * precio acumulado del baguette
  * @param pan - String que representa el tipo del 
  * pan
  */
  public Pan(double precio, String pan){
    descripcion = " - Pan: " + pan + ", precio: " + precio;
    cantidadPollo = 0;
    cantidadPepperoni = 0;
    cantidadJamon = 0;
    cantidadLechuga = 0;
    cantidadJitomate = 0;
    cantidadCebolla = 0;
    cantidadMostaza = 0;
    cantidadCatsup = 0;
    cantidadMayonesa = 0;
    this.precio = precio;
    precioPan = precio;
  }

  @Override
  public double getPrecioPan(){
    return precioPan;
  }

  @Override
  public String getDescripcion(){
    return descripcion;
  }

  @Override
  public int getCantidadPollo(){
    return cantidadPollo;
  }

  @Override
  public int getCantidadPepperoni(){
    return cantidadPepperoni;
  }

  @Override
  public int getCantidadJamon(){
    return cantidadJamon;
  }

  @Override
  public int getCantidadLechuga(){
    return cantidadLechuga;
  }

  @Override
  public int getCantidadJitomate(){
    return cantidadJitomate;
  }

  @Override
  public int getCantidadCebolla(){
    return cantidadCebolla;
  }
  
  @Override
  public int getCantidadMostaza(){
    return cantidadMostaza;
  }

  @Override
  public int getCantidadCatsup(){
    return cantidadCatsup;
  }

  @Override
  public int getCantidadMayonesa(){
    return cantidadMayonesa;
  }

  @Override
  public double getPrecio(){
    return precio;
  }
}