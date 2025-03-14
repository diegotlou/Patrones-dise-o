/*
* @author Diego Martine Calzada
* clase Platillo para los platillos, por si despues se
* piensan agregar mas
*/

public class Platillo{
  private String id;
  private String nombre;
  private String descripcion;
  private int precio;
  private boolean conQueso;
  private boolean esVegetariano;

  /*
  * Constructor con parametros de Platillo
  * @param id - String que es el ID de un Platillo
  * @param nombre - String que es el nombre de un 
  * Platillo
  * @param descripcion - String que es la descripcion 
  * de un Platillo
  * @param precio - int que es el precio de un 
  * Platillo
  * @param conQueso - boolean que nos dice si tiene 
  * queso o no
  * @param esVegetariano - boolean que nos dice si 
  * es vegetariano o no
  */
  public Platillo(String id, String nombre, String descripcion, int precio, boolean conQueso, boolean esVegetariano){
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.conQueso = conQueso;
    this.esVegetariano = esVegetariano;
  }

  /*
  * Metodo getId
  * @return String - id
  */
  public String getId(){
    return id;
  }

  /*
  * Metodo getNombre
  * @return String - nombre
  */
  public String getNombre(){
    return nombre;
  }

  /*
  * Metodo getDescripcion
  * @return String - descripcion
  */
  public String getDescripcion(){
    return descripcion;
  }

  /*
  * Metodo getPrecio
  * @return int - precio
  */
  public int getPrecio(){
    return precio;
  }

  /*
  * Metodo toString
  * @return String - tiene la informacion del Platillo
  */
  public String toString(){
    return ("\n ____________ \n ID: " + id + " \n Nombre: " + nombre + "\n Descripcion: " + descripcion + "\n Precio: " + precio);
  }

  /*
  * Metodo getConQueso
  * @return boolean - conQueso
  */
  public boolean getConQueso(){
    return conQueso;
  }

  /*
  * Metodo getEsVegetariano
  * @return boolean - esVegetariano
  */
  public boolean getEsVegetariano(){
    return esVegetariano;
  }

}