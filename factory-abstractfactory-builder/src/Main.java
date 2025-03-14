/**
* Clase para main
* @author: Diego Martinez Calzada
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Ensamblador ensamblador = new Ensamblador();
    double dinero = 3000.0; 
    int opcion = 1;
    boolean aux = false;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Hola :D tienes 3000 cheemscoins");
    while(!aux){
      System.out.println("Elige una opcion" + "\n 1. Carro Normal" + "\n 2. Carro Veloz" + "\n 3. Carro Defensor" + "\n 4. Personalizar un carro" + "\n 0. Salir");
      opcion = teclado.nextInt();
      switch(opcion){
        case 0:
          System.out.println("Weno adios");
          aux = true;
          break;
        case 1:
          System.out.println("Carro Normal");
          Carro carroN = ensamblador.carroNormal();
          carroN.mostrarCarro();
          dinero = dinero - carroN.obtenCosto();
          System.out.println("Te quedan: " + dinero);
          aux = true;
          break;
        case 2:
          System.out.println("Carro Veloz");
          Carro carroV = ensamblador.carroVeloz();
          carroV.mostrarCarro();
          dinero = dinero - carroV.obtenCosto();
          System.out.println("Te quedan: " + dinero);
          aux = true;
          break;
        case 3:
          System.out.println("Carro Defensor");
          Carro carroD = ensamblador.carroDefensor();
          carroD.mostrarCarro();
          dinero = dinero - carroD.obtenCosto();
          System.out.println("Te quedan: " + dinero);
          aux = true;
          break;
        case 4:
          Carro carroP = ensamblador.crearCarro(dinero);
          System.out.println("Carro Personalizado");
          carroP.mostrarCarro();
          dinero = dinero - carroP.obtenCosto();
          System.out.println("Te quedan: " + dinero);
          aux = true;
          break;
        default:
          System.out.println("Opcion no valida D:");
      }
    }
  }
}