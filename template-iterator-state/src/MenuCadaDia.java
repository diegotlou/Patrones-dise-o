/*
* @author Diego Martine Calzada
* clase MenuCadaDia clase del menu que cambia cada dia 
*/

import java.util.Iterator;
import java.util.ArrayList;

public class MenuCadaDia {
  private ArrayList<Hamburguesa> hamburguesas;

  /*
  * Metodo contructor MenuCadaDia sin parametros 
  */
  public MenuCadaDia (){
    hamburguesas = new ArrayList<Hamburguesa>();
    Hamburguesa h1 = new Hamburguesa("HCD1", "0% vegetariana", "No lleva cosas de color verde pero tampoco lleva queso", 90, false, false);
    hamburguesas.add(h1);
    Hamburguesa h2 = new Hamburguesa("HCD2", "100% vegetariana con queso", "No lleva nada que haya tenido padres", 120, true, false);
    hamburguesas.add(h2);
    Hamburguesa h3 = new Hamburguesa("HCD3", "50/50", "Carne, queso y vegetales", 100, true, true);
    hamburguesas.add(h3);
  }

  /*
  * Metodo setUnaHamburguesa agrega una Hamburguesa a 
  * hamburguesas 
  * @param h - Hamburguesa a meter
  */
  public void setUnaHamburguesa(Hamburguesa h){
    hamburguesas.add(h);
  }

  /*
  * Metodo sacarUnaHamburguesa por su indice
  * @param i - int indice de la Hamburguesa
  */
  public void sacarUnaHamburguesa(int i){
    hamburguesas.remove(i);
  }

  /*
  * Metodo sacarUnaHamburguesa saca una Hamburguesa 
  * @param h - Hamburguesa a sacar
  */
  public void sacarUnaHamburguesa(Hamburguesa h){
    hamburguesas.remove(h);
  }

  /*
  * Metodo getIterator regresa un Iterator
  * @return Iterator - iterador de hamburguesas
  */
  public Iterator getIterator(){
    return hamburguesas.iterator();
  }
}