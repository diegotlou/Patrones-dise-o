/*
* @author Diego Martine Calzada
* clase MenuDeLujo clase del menu de lujo
*/

import java.util.Iterator;
import java.util.Hashtable;

public class MenuDeLujo {
  private Hashtable<Integer, Hamburguesa> hamburguesas;

  /*
  * Metodo contructor MenuDeLujo sin parametros 
  */
  public MenuDeLujo(){
    hamburguesas = new Hashtable<Integer, Hamburguesa>();
    Hamburguesa h1 = new Hamburguesa("HDL1", "Tapa Arterias", "Nueva hamburguesa de puerco, si encuentras una hamburguesa mas grasosa les dare un premio", 250, true, false);
    hamburguesas.put(0, h1);
    Hamburguesa h2 = new Hamburguesa("HDL2", "Burguer^2", "Comenzamos con carne de primera, se la damos a otras vacas, luego las matamos, hamburguesas al cuadrado", 200, true, false);
    hamburguesas.put(1, h2);
    Hamburguesa h3 = new Hamburguesa("HDL3", "No es lo mismo", "Es la misma hamburguesa pero cuesta mas caro y lleva tocino", 400, true, false);
    hamburguesas.put(2, h3);
  }

  /*
  * Metodo getIterator regresa un Iterator
  * @return Iterator - iterador de hamburguesas
  */
  public Iterator getIterator(){
    return hamburguesas.values().iterator();
  }
}