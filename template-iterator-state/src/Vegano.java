/*
* @author Diego Martine Calzada
* clase Vegano, extiende de Coccion es la que prepara
* las Hamburguesa sin queso y vegetarianas
*/

public class Vegano extends Coccion{
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
  }
}