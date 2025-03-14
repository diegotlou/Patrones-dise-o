/**
* Clase PizzaDonCangrejo
* @author: Diego Martinez Calzada
*/

public class PizzaDonCangrejo{
  private String queso;
  private String carne;
  private String masa;
  private double precio;

  /**
  * Constructor de PizzaDonCangrejo con parametros
  * @param queso -- String el tipo de queso
  * @param carne -- String el tipo de carne
  * @param masa -- String el tipo de masa
  * @param precio -- double precio de la pizza
  */
  public PizzaDonCangrejo(String queso, String carne, String masa, double precio){
    this.queso = queso;
    this.carne = carne;
    this.masa = masa;
    this.precio = precio;
  }

  /**
  * Metodo que regresa el tipo de queso
  * @return String -- el tipo de queso
  */
  public String getQueso(){
    return queso;
  }

  /**
  * Metodo que regresa el tipo de carne
  * @return String -- el tipo de carne
  */
  public String getCarne(){
    return carne;
  }

  /**
  * Metodo que regresa el tipo de masa
  * @return String -- el tipo de masa
  */
  public String getMasa(){
    return masa;
  }

  /**
  * Metodo que regresa el precio de la pizza
  * @return double -- el precio de la pizza
  */
  public double getPrecio(){
    return precio;
  }
}