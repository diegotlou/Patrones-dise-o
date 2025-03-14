/*
* @author Diego Martine Calzada
* clase Lector que tiene los iteradores de todos los 
* menus
*/

import java.util.Iterator;

public class Lector{
  private MenuDeLujo hamburguesasLujo;
  private MenuCadaDia hamburguesasDia;
  private MenuGeneral hamburguesasGral;

  /*
  * Metodo Lector constructor de Lector sin paramitros
  */
  public Lector(){
    hamburguesasLujo = new MenuDeLujo();
    hamburguesasDia = new MenuCadaDia();
    hamburguesasGral = new MenuGeneral();
  }

  /*
  * Metodo getIteradorMenuCD 
  * @return Iterator - Iterator de hamburguesasDia
  */
  public Iterator getIteradorMenuCD(){
    return hamburguesasDia.getIterator();
  }

  /*
  * Metodo getIteradorMenuDL 
  * @return Iterator - Iterator de hamburguesasLujo
  */
  public Iterator getIteradorMenuDL(){
    return hamburguesasLujo.getIterator();
  }

  /*
  * Metodo getIteradorMenuG 
  * @return Iterador - Iterador de hamburguesasGral
  */
  public Iterador getIteradorMenuG(){
    return hamburguesasGral.getIterador();
  }

}