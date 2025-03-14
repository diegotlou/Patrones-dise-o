/**
* Clase para main
* @author: Diego Martinez Calzada
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean aux = false;
    while(aux == false){

      Scanner teclado = new Scanner(System.in);
      int n;
      System.out.print("Introduzca una opcion valida, si oprimes otra opcion no se te tomara la orden >:v \n 1. Pizza \n 2. Baguette \n 3. Salir de la fila \n ");
      n = teclado.nextInt();
      switch(n){
        case 1:
          System.out.println("Elige una pizza \n 1. Pizza de Jamon: jamon, queso chedar y masa gruesa \n 2. Pizza Italiana: pepperoni, queso manchego y masa delgada \n 3. Pizza Gringa: salchicha, queso manchego y masa gruesa \n 4. Pizza de Pollo: pollo, queso manchego y masa delgada \n 5. Pizza de Salchicha: salchicha, queso chedar y masa delgada");

          int m = teclado.nextInt();

          switch(m){
            case 1:
              PizzaDonCangrejo pizzaJ = new PizzaJamon();
              AdapterPizzasDC adapterJ = new AdapterPizzasDC(pizzaJ);
              System.out.println("Aqui tiene su ticket gracias vuelva pronto :D");
              adapterJ.imprimirTicket();
              aux = true;
              break;

            case 2:
              PizzaDonCangrejo pizzaI = new PizzaItaliana();
              AdapterPizzasDC adapterI = new AdapterPizzasDC(pizzaI);
              System.out.println("Aqui tiene su ticket gracias vuelva pronto :D");
              adapterI.imprimirTicket();
              aux = true;
              break;

            case 3:
              PizzaDonCangrejo pizzaG = new PizzaGringa();
              AdapterPizzasDC adapterG = new AdapterPizzasDC(pizzaG);
              System.out.println("Aqui tiene su ticket gracias vuelva pronto :D");
              adapterG.imprimirTicket();
              aux = true;
              break;

            case 4:
              PizzaDonCangrejo pizzaP = new PizzaPollo();
              AdapterPizzasDC adapterP = new AdapterPizzasDC(pizzaP);
              System.out.println("Aqui tiene su ticket gracias vuelva pronto :D");
              adapterP.imprimirTicket();
              aux = true;
              break;

            case 5:
              PizzaDonCangrejo pizzaS = new PizzaSalchicha();
              AdapterPizzasDC adapterS = new AdapterPizzasDC(pizzaS);
              System.out.println("Aqui tiene su ticket gracias vuelva pronto :D");
              adapterS.imprimirTicket();
              aux = true;
              break;
          
            default:
              System.out.println("Opcion no valida D:, escoge de nuevo >:v");
              break;
          }
          break;

        case 2:
          System.out.println("Para empezar a preparar tu Baguette primero elige el tipo de pan: \n 1. Pan Normal \n 2. Pan Artesanal :D");
          int p = teclado.nextInt();
          switch(p){
            case 1:
              Baguette panN = new PanNormal();
              boolean auxB = false;
              while(auxB == false){
                System.out.println("Elige el ingrediente que le quieras agregar a tu Baguette \n 1. Pollo \n 2. Pepperoni \n 3. Jamon \n 4. Lechuga \n 5. Jitomate \n 6. Cebolla \n 7. Mostaza \n 8. Catsup \n 9. Mayonesa \n 10. Salir");
                int q = teclado.nextInt();
                switch(q){
                  case 1:
                    System.out.println("Elige cuantas piezas de pollo, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int a = teclado.nextInt();
                    if(a < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panN = new Pollo(panN, a);
                    }
                    break;
                  
                  case 2:
                    System.out.println("Elige cuantas rebanadas de pepperoni, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int b = teclado.nextInt();
                    if(b < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panN = new Pepperoni(panN, b);
                    }
                    break;
                  
                  case 3:
                    System.out.println("Elige cuantas rebanadas de Jamon, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int c = teclado.nextInt();
                    if(c < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panN = new Jamon(panN, c);
                    }
                    break;

                  case 4:
                    System.out.println("Elige cuantas hojas de Lechuga, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int d = teclado.nextInt();
                    if(d < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panN = new Lechuga(panN, d);
                    }
                    break;

                  case 5:
                    System.out.println("Elige cuantas piezas de Jitomate, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int e = teclado.nextInt();
                    if(e < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panN = new Jitomate(panN, e);
                    }
                    break;

                  case 6:
                    System.out.println("Elige cuantas rebanadas de Cebolla, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int f = teclado.nextInt();
                    if(f < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panN = new Cebolla(panN, f);
                    }
                    break;

                  case 7:
                    System.out.println("Elige cuantos sobres de Mostaza, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int g = teclado.nextInt();
                    if(g < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panN = new Mostaza(panN, g);
                    }
                    break;

                  case 8:
                    System.out.println("Elige cuantas sobres de Catsup, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int h = teclado.nextInt();
                    if(h < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panN = new Catsup(panN, h);
                    }
                    break;

                  case 9:
                    System.out.println("Elige cuantas sobres de Mayonesa, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int i = teclado.nextInt();
                    if(i < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panN = new Mayonesa(panN, i);
                    }
                    break;

                  case 10:
                    BaguetteWS waySub = new BaguetteWS(panN);
                    System.out.println("Aqui tiene su ticket gracias vuelva pronto :D");
                    waySub.imprimirTicket();
                    auxB = true;
                    aux = true;
                    break;

                  default:
                    System.out.println("Opcion no valida D:");
                    break;
                }
              }
              break;

            case 2:
              Baguette panA = new PanArtesanal();
              boolean auxC = false;
              while(auxC == false){
                System.out.println("Elige el ingrediente que le quieras agregar a tu Baguette \n 1. Pollo \n 2. Pepperoni \n 3. Jamon \n 4. Lechuga \n 5. Jitomate \n 6. Cebolla \n 7. Mostaza \n 8. Catsup \n 9. Mayonesa \n 10. Salir");
                int q = teclado.nextInt();
                switch(q){
                  case 1:
                    System.out.println("Elige cuantas piezas de pollo, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int a = teclado.nextInt();
                    if(a < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panA = new Pollo(panA, a);
                    }
                    break;
                  
                  case 2:
                    System.out.println("Elige cuantas rebanadas de pepperoni, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int b = teclado.nextInt();
                    if(b < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panA = new Pepperoni(panA, b);
                    }
                    break;
                  
                  case 3:
                    System.out.println("Elige cuantas rebanadas de Jamon, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int c = teclado.nextInt();
                    if(c < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panA = new Jamon(panA, c);
                    }
                    break;

                  case 4:
                    System.out.println("Elige cuantas hojas de Lechuga, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int d = teclado.nextInt();
                    if(d < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panA = new Lechuga(panA, d);
                    }
                    break;

                  case 5:
                    System.out.println("Elige cuantas piezas de Jitomate, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int e = teclado.nextInt();
                    if(e < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panA = new Jitomate(panA, e);
                    }
                    break;

                  case 6:
                    System.out.println("Elige cuantas rebanadas de Cebolla, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int f = teclado.nextInt();
                    if(f < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panA = new Cebolla(panA, f);
                    }
                    break;

                  case 7:
                    System.out.println("Elige cuantos sobres de Mostaza, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int g = teclado.nextInt();
                    if(g < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panA = new Mostaza(panA, g);
                    }
                    break;

                  case 8:
                    System.out.println("Elige cuantas sobres de Catsup, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int h = teclado.nextInt();
                    if(h < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panA = new Catsup(panA, h);
                    }
                    break;

                  case 9:
                    System.out.println("Elige cuantas sobres de Mayonesa, puedes volver a agregar despues, siempre y cuando no te salgas D:");
                    int i = teclado.nextInt();
                    if(i < 1){
                      System.out.println("Opcion no valida D:");
                    }else{
                      panA = new Mayonesa(panA, i);
                    }
                    break;

                  case 10:
                    BaguetteWS waySub = new BaguetteWS(panA);
                    System.out.println("Aqui tiene su ticket gracias vuelva pronto :D");
                    waySub.imprimirTicket();
                    auxC = true;
                    aux = true;
                    break;

                  default:
                    System.out.println("Opcion no valida D:");
                    break;
                }
              }
              break;

            default:
              System.out.println("Opcion no valida");
          }
        break;

        default:
          aux = true;
          System.out.println(">:v");
          break;
      }

    }

  }
}