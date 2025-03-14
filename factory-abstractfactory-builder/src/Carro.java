/**
* Clase Carro
* @author: Diego Martinez Calzada
*/

public class Carro{
  private Pieza llanta;
  private Pieza motor;
  private Pieza carroceria;
  private Pieza blindaje;
  private Pieza arma;

  /**
  * Metodo constructor del Carro
  * @param llanta - Llanta del carro
  * @param motor - Motor del carro
  * @param carroceria - Carroceria del carro
  * @param blindaje - Blindaje del carro
  * @param arma - Arma del carro
  */
  public Carro(Llanta llanta, Motor motor, Carroceria carroceria, Blindaje blindaje, Arma arma){
    this.llanta = llanta;
    this.motor = motor;
    this.carroceria = carroceria;
    this.blindaje = blindaje;
    this.arma = arma;
  }

  /**
  * Metodo que regresa el costo del Carro
  * @return double - costo del Carro
  */
  public double obtenCosto(){
    return llanta.costo() + motor.costo() + carroceria.costo() + blindaje.costo() + arma.costo();
  }

  /**
  * Metodo que regresa el ataque del Carro
  * @return int - ataque del Carro
  */
  public int obtenAtaque(){
    return llanta.ataque() + motor.ataque() + carroceria.ataque() + blindaje.ataque() + arma.ataque();
  }

  /**
  * Metodo que regresa la defensa del Carro
  * @return int - defensa del Carro
  */
  public int obtenDefensa(){
    return llanta.defensa() + motor.defensa() + carroceria.defensa() + blindaje.defensa() + arma.defensa();
  }

  /**
  * Metodo que regresa la velocidad del Carro
  * @return int - velocidad del Carro
  */
  public int obtenVelocidad(){
    return llanta.velocidad() + motor.velocidad() + carroceria.velocidad() + blindaje.velocidad() + arma.velocidad();
  }

  /**
  * Metodo que imprime los detalles del Carro
  */
  public void mostrarCarro(){
    System.out.println("***********************");
    System.out.println("+ Llanta: " + llanta.nombre() + ", ataque: " + llanta.ataque() + ", defensa: " + llanta.defensa() + ", velocidad: " + llanta.velocidad() + ", precio: " + llanta.costo());
    System.out.println("+ Motor: " + motor.nombre() + ", ataque: " + motor.ataque() + ", defensa: " + motor.defensa() + ", velocidad: " + motor.velocidad() + ", precio: " + motor.costo());
    System.out.println("+ Carroceria: " + carroceria.nombre() + ", ataque: " + carroceria.ataque() + ", defensa: " + carroceria.defensa() + ", velocidad: " + carroceria.velocidad() + ", precio: " + carroceria.costo());
    System.out.println("+ Blindaje: " + blindaje.nombre() + ", ataque: " + blindaje.ataque() + ", defensa: " + blindaje.defensa() + ", velocidad: " + blindaje.velocidad() + ", precio: " + blindaje.costo());
    System.out.println("+ Arma: " + arma.nombre() + ", ataque: " + arma.ataque() + ", defensa: " + arma.defensa() + ", velocidad: " + arma.velocidad() + ", precio: " + arma.costo());
    System.out.println("\n CARRO con ataque: " + obtenAtaque() + ", defensa: " + obtenDefensa() + ", velocidad: " + obtenVelocidad() + ", precio: " + obtenCosto());
    System.out.println("***********************");
  }
}