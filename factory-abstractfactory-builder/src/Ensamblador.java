/**
* Clase Ensamblador
* @author: Diego Martinez Calzada
*/

import java.util.Scanner;

public class Ensamblador {

  /**
  * Metodo carroNormal que crea un Carro con piezas
  * antes elegidas
  */
  public Carro carroNormal(){
    Carro carrito = new Carro(new Simples(), new Diesel(), new Casual(), new Simple(), new Sierra());
    return carrito;
  }

  /**
  * Metodo carroVeloz que crea un Carro con piezas
  * antes elegidas enfocadas a la velocidad
  */
  public Carro carroVeloz(){
    Carro carrito = new Carro(new Deportivas(), new Deportivo(), new Deportiva(), new Simple(), new Lanzallamas());
    return carrito;
  }

  /**
  * Metodo carroDefensor que crea un Carro con piezas
  * antes elegidas enfocadas a la defensa
  */
  public Carro carroDefensor(){
    Carro carrito = new Carro(new OrugaTanque(), new Diesel(), new Camion(), new Tanque(), new Arpones());
    return carrito;
  }

  /**
  * Metodo crearCarro que crea un Carro personalizado
  * @param d - double que representa el dinero del
  * cliente
  * @return Carro - el Carro personalizado
  */
  public Carro crearCarro(double d){
    Llanta llanta = crearLlanta(d);
    System.out.println("Ensamblando llanta .....");
    System.out.println(" .....");
    System.out.println("¡Llanta lista! :D");
    d = d - llanta.costo();
    System.out.println("Te quedan: " + d);
    Motor motor = crearMotor(d);
    System.out.println("Ensamblando motor .....");
    System.out.println(" .....");
    System.out.println("¡Motor listo! :D");
    d = d - motor.costo();
    System.out.println("Te quedan: " + d);
    Carroceria carroceria = crearCarroceria(d);
    System.out.println("Ensamblando carroceria .....");
    System.out.println(" .....");
    System.out.println("¡Carroceria lista! :D");
    d = d - carroceria.costo();
    System.out.println("Te quedan: " + d);
    Blindaje blindaje = crearBlindaje(d);
    System.out.println("Ensamblando blindaje .....");
    System.out.println(" .....");
    System.out.println("Blindaje listo! :D");
    d = d - blindaje.costo();
    System.out.println("Te quedan: " + d);
    Arma arma = crearArma(d);
    System.out.println("Ensamblando arma .....");
    System.out.println(" .....");
    System.out.println("Arma lista! :D");
    Carro carrito = new Carro(llanta, motor, carroceria, blindaje, arma);
    return carrito;
  }

  /**
  * Metodo crearLlanta que crea una Llanta personalizada
  * @param d - double que representa el dinero del
  * cliente
  * @return Llanta - la Llanta personalizada
  */
  public Llanta crearLlanta(double d){
    Scanner teclado = new Scanner(System.in);
    int opcion;
    System.out.println("*** Elige el tipo de llantas:" + "\n 1.- Simples" + "\n 2.- Deportivas" + "\n 3.- Off-Road" + "\n 4.- Oruga de Tanque");
    boolean aux = false;
    Llanta llanta = new Simples();

    while(aux == false){
      opcion = teclado.nextInt();
      
      switch(opcion){
        case 1:
          llanta = new Simples();
          if(llanta.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 2:
          llanta = new Deportivas();
          if(llanta.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 3:
          llanta = new OffRoad();
          if(llanta.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 4:
          llanta = new OrugaTanque();
          if(llanta.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        default:
          System.out.println("No disponible D:");
          break;
      }
    }
    return llanta;
  }

  /**
  * Metodo crearMotor que crea un Motor personalizado
  * @param d - double que representa el dinero del
  * cliente
  * @return Motor - regresa el Motor personalizado
  */
  public Motor crearMotor(double d){
    Scanner teclado = new Scanner(System.in);
    int opcion;
    System.out.println("*** Elige el tipo de motor:" + "\n 1.- Deportivo" + "\n 2.- Diesel" + "\n 3.- Turbo");
    boolean aux = false;
    Motor motor = new Diesel();

    while(aux == false){
      opcion = teclado.nextInt();
      
      switch(opcion){
        case 1:
          motor = new Deportivo();
          if(motor.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 2:
          motor = new Diesel();
          if(motor.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 3:
          motor = new Turbo();
          if(motor.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        default:
          System.out.println("No disponible D:");
          break;
      }
    }
    return motor;
  }

  /**
  * Metodo crearCarroceria que crea una Carroceria 
  * personalizada
  * @param d - double que representa el dinero del
  * cliente
  * @return Carroceria - regresa la Carroceria 
  * personalizado
  */
  public Carroceria crearCarroceria(double d){
    Scanner teclado = new Scanner(System.in);
    int opcion;
    System.out.println("*** Elige el tipo de carroceria:" + "\n 1.- Casual" + "\n 2.- Camion" + "\n 3.- Deportiva");
    boolean aux = false;
    Carroceria carroceria = new Casual();

    while(aux == false){
      opcion = teclado.nextInt();
      
      switch(opcion){
        case 1:
          carroceria = new Casual();
          if(carroceria.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 2:
          carroceria = new Camion();
          if(carroceria.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 3:
          carroceria = new Deportiva();
          if(carroceria.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        default:
          System.out.println("No disponible D:");
          break;
      }
    }
    return carroceria;
  }

  /**
  * Metodo crearBlindaje que crea un Blindaje 
  * personalizado
  * @param d - double que representa el dinero del
  * cliente
  * @return Blindaje - regresa el Blindaje personalizado
  */
  public Blindaje crearBlindaje(double d){
    Scanner teclado = new Scanner(System.in);
    int opcion;
    System.out.println("*** Elige el tipo de blindaje:" + "\n 1.- Simple" + "\n 2.- Reforzado" + "\n 3.- Tanque");
    boolean aux = false;
    Blindaje blindaje = new Simple();

    while(aux == false){
      opcion = teclado.nextInt();
      
      switch(opcion){
        case 1:
          blindaje = new Simple();
          if(blindaje.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 2:
          blindaje = new Reforzado();
          if(blindaje.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 3:
          blindaje = new Tanque();
          if(blindaje.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        default:
          System.out.println("No disponible D:");
          break;
      }
    }
    return blindaje;
  }

  /**
  * Metodo crearArma que crea una Arma personalizada
  * @param d - double que representa el dinero del
  * cliente
  * @return Arma - regresa Arma personalizada
  */
  public Arma crearArma(double d){
    Scanner teclado = new Scanner(System.in);
    int opcion;
    System.out.println("*** Elige el tipo de llantas:" + "\n 1.- Arpones" + "\n 2.- Lanzallamas" + "\n 3.- Canones" + "\n 4.- Sierra" + "\n 5.- Metralleta");
    boolean aux = false;
    Arma arma = new Arpones();

    while(aux == false){
      opcion = teclado.nextInt();
      
      switch(opcion){
        case 1:
          arma = new Arpones();
          if(arma.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 2:
          arma = new Lanzallamas();
          if(arma.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 3:
          arma = new Canones();
          if(arma.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 4:
          arma = new Sierra();
          if(arma.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        case 5:
          arma = new Metralleta();
          if(arma.costo() < d){
            aux = true;
          }else{
            System.out.println("D: no te alcanza");
          }
          break;
        default:
          System.out.println("No disponible D:");
          break;
      }
    }
    return arma;
  }
}