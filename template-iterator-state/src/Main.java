/*
* @author Diego Martine Calzada
* clase Main para probar al Chefsito
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hola bienvenido \nSoy CHEFSITO, estoy para servirte, este es mi menu");

    Chefsito chefsito = new Chefsito();

    Scanner sc = new Scanner(System.in);
		int opcion;

    do{
			System.out.println(
				"1.- Activar.\n" +
				"2.- Caminar.\n" + 
				"3.- Atender.\n" + 
				"4.- Cocinar.\n" +
				"5.- Entregar.\n" +
        "6.- Apagar.\n" +
				"0.- Terminar simulacion.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige la opcion VALIDA "
							+ "que deseas ejecutar.\n" + 
							"1.- Activar.\n" +
							"2.- Caminar.\n" + 
							"3.- Atender.\n" + 
							"4.- Cocinar.\n" +
              "5.- Entregar.\n" +
							"6.- Apagar.\n" +
							"0.- Terminar simulacion.\n");
					}
				}

				switch(opcion){
					case 1:
						chefsito.activar();
						break;

					case 2:
						chefsito.caminar();
						break;

					case 3:
						chefsito.atender();
						break;

					case 4:
						chefsito.cocinar();
						break;

					case 5:
						chefsito.entregar();
						break;

          case 6:
            chefsito.apagarse();
						break;

					case 0:
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);
  }
}