/*
* @author Diego Martine Calzada
* interface EstadoChefisto que los metodos de estados 
* del Chefsito
*/

public interface EstadoChefsito{
  /*
  * Metodo activar, se ejecuta activar en el 
  * estadoActual
  */
  public void activar();

  /*
  * Metodo caminar, se ejecuta caminar en el 
  * estadoActual
  */
  public void caminar();

  /*
  * Metodo atender, se ejecuta atender en el 
  * estadoActual
  */
  public void atender();

  /*
  * Metodo cocinar, se ejecuta cocinar en el 
  * estadoActual
  */
  public void cocinar();

  /*
  * Metodo entregar, se ejecuta entregar en el 
  * estadoActual
  */
  public void entregar();

  /*
  * Metodo apagarse, se ejecuta apagarse en el 
  * estadoActual
  */
  public void apagarse();
}