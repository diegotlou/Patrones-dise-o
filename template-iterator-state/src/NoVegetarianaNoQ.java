/*
* @author Diego Martine Calzada
* clase NoVegetarianaNoQ, extiende de Coccion es la que 
* prepara las Hamburguesa que no son vegetarianas ni
* tiene queso
*/

public class NoVegetarianaNoQ extends Coccion{
  @Override
  public void prepararCarneOToffu(){
    System.out.println("- Preparar la carne");
  }

  @Override
  public void ponerCarneOToffu(){
    System.out.println("- Poner la carne");
  }

  @Override
  public void ponerQueso(){
    System.out.println("");
  }
}