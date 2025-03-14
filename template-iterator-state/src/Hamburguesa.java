/*
* @author Diego Martine Calzada
* clase Hamburguesa que extiende de Platillo 
*/

public class Hamburguesa extends Platillo {

  /*
  * Metodo constructor con parametros de Hamburguesa
  * @param id - String que es el ID de una Hamburguesa
  * @param nombre - String que es el nombre de una 
  * Hamburguesa
  * @param descripcion - String que es la descripcion 
  * de una Hamburguesa
  * @param precio - int que es el precio de una 
  * Hamburguesa
  * @param conQueso - boolean que nos dice si tiene 
  * queso o no
  * @param esVegetariano - boolean que nos dice si 
  * es vegetariano o no
  */
  public Hamburguesa (String id, String nombre, String descripcion, int precio, boolean conQueso, boolean esVegetariano){
    super(id, nombre, descripcion, precio, conQueso, esVegetariano);
  }

}