/*
* @author Diego Martine Calzada
* clase VegetarianaConQ, extiende de Coccion es la que 
* prepara las Hamburguesa con queso y vegetarianas
*/

public class VegetarianaConQ extends Coccion{
  @Override
  public void prepararCarneOToffu(){
    System.out.println("- Preparar el Toffu");
  }

  @Override
  public void ponerCarneOToffu(){
    System.out.println("- Poner el Toffu");
  }

  @Override
  public void ponerQueso(){
    System.out.println("- Poner el queso");
  }
}