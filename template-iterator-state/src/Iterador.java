/*
* @author Diego Martine Calzada
* interface Iterador, el Iterador de MenuGeneral 
*/

public interface Iterador{
  
  /*
  * Metodo hasNext nos dice si hay un siguiente
  * @return boolean - true si hay y false si no
  */
  public boolean hasNext();
  
  /*
  * Metodo next nos da el siguiente
  * @return Object - el siguiente que hay
  */
  public Object next();
}