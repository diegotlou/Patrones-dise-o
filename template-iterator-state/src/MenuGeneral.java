/*
* @author Diego Martine Calzada
* clase MenuGeneral clase del menu general 
*/

public class MenuGeneral {
  private Hamburguesa [] hamburguesas;

  /*
  * Metodo contructor MenuGeneral sin parametros 
  */
  public MenuGeneral (){
    hamburguesas = new Hamburguesa [3];
    Hamburguesa h1 = new Hamburguesa("HG1", "Sencilla", "Hamburguesa con carne y vegetales", 50, false, false);
    hamburguesas[0] = h1;
    Hamburguesa h2 = new Hamburguesa("HG2", "Con queso", "Hamburguesa con carne y queso", 60, true, false);
    hamburguesas[1] = h2;
    Hamburguesa h3 = new Hamburguesa("HG3", "Sin nombre", "Vegetariana sin queso", 50, false, true);
    hamburguesas[2] = h3;
  }

  /*
  * Metodo getIterador regresa un Iterador
  * @return Iterator - IteradorMenuGeneral()
  */
  public Iterador getIterador(){
    return new IteradorMenuGeneral();
  }

  /*
  * Clase privada IteradorMenuGeneral que implementa de
  * Iterador
  */
  private class IteradorMenuGeneral implements Iterador{
    int indice = 0;

    @Override
    public boolean hasNext(){
      if(indice < hamburguesas.length){
        return true;
      }
      return false;
    }

    @Override
    public Object next(){
      if(this.hasNext()){
        int aux = indice;
        indice++;
        return hamburguesas[aux];
      }
      return null;
    }
  }
}