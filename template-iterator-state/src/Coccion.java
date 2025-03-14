/*
* @author Diego Martine Calzada
* clase abstracta Coccion que imprime los procesos
* de cada Hamburguesa
*/

public abstract class Coccion{

  /*
  * Metodo coccionH
  */
  public void coccionH(Hamburguesa h){
    ponerPan();
    ponerMayonesa();
    prepararCarneOToffu();
    ponerCarneOToffu();
    ponerQueso();
    ponerVegetales();
    ponerCatsup();
    ponerPan();
  }

  /*
  * Metodo ponerPan, imprime que pone el pan
  */
  public void ponerPan(){
    System.out.println("~ Poner pan");
  }

  /*
  * Metodo ponerMayonesa, imprime que pone la mayonesa
  */
  public void ponerMayonesa(){
    System.out.println("~ Poner mayonesa");
  }

  /*
  * Metodo ponerMostaza, imprime que pone la mostaza
  */
  public void ponerMostaza(){
    System.out.println("~ Poner mostaza");
  }

  /*
  * Metodo abstract prepararCarneOToffu, imprime que 
  * prepara la carne o el toffu
  */
  public abstract void prepararCarneOToffu();

  /*
  * Metodo abstract ponerCarneOToffu, imprime que 
  * pone la carne o el toffu
  */
  public abstract void ponerCarneOToffu();

  /*
  * Metodo abstract ponerQueso, imprime que 
  * pone el quso o no
  */
  public abstract void ponerQueso();

  /*
  * Metodo ponerVegetales, imprime que pone los
  * vegetales
  */
  public void ponerVegetales(){
    System.out.println("~ Poner vegetales");
  }

  /*
  * Metodo ponerCatsup, imprime que pone la catsup
  */
  public void ponerCatsup(){
    System.out.println("~ Poner catsup");
  }
}