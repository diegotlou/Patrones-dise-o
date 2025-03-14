/*
* @author Diego Martine Calzada
* clase ConQueso, extiende de Coccion es la que prepara
* las Hamburguesa con queso
*/

public class ConQueso extends Coccion{
  @Override
  public void prepararCarneOToffu(){
    System.out.println("- Preparar carne");
  }

  @Override
  public void ponerCarneOToffu(){
    System.out.println("- Poner el carne");
  }

  @Override
  public void ponerQueso(){
    System.out.println("- Poner el queso");
  }
}