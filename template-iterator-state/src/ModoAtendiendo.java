/*
* @author Diego Martine Calzada
* clase ModoAtendiendo que implementa EstadoChefsito,  
* estado atendiendo del Chefsito 
*/

import java.util.Scanner;

public class ModoAtendiendo implements EstadoChefsito{

  Chefsito chefsito;

  /*
  * Metodo contructor ModoAtendiendo con parametros 
  * @param chefsito - Chefsito
  */
  public ModoAtendiendo(Chefsito chefsito){
    this.chefsito = chefsito;
  }

  @Override
  public void activar(){
    System.out.println("***MODO ATENDIENDO***\nCHEFSITO ya esta activado.");
  }

  @Override
  public void caminar(){
    System.out.println("***MODO ATENDIENDO***\nCHEFSITO no puede caminar mientras esta atendiendo.");
  }

  @Override
  public void atender(){
    if(!chefsito.getPlatilloRecibido()){
      System.out.println("***MODO ATENDIENDO***\nCHEFSITO te mostrara los menus.");
      chefsito.mostrarMenus();
      Scanner sc = new Scanner(System.in);

      while(!chefsito.getPlatilloRecibido()){
        System.out.println("\nIngresa el ID de la hamburguesa que quieras");
        String id = sc.nextLine();
        chefsito.getOrdenPlatillo(id);
        if(chefsito.getPlatilloRecibido()){
          chefsito.setId(id);
          chefsito.setPlatilloRecibido();
          System.out.println("***MODO ATENDIENDO***\nCHEFSITO tiene tu orden puede pasar a MODO COCINANDO");
        }else{
          System.out.println("Hamburguesa no disponible D: ingresa otra opcion");
        }
      }
    }else{
      System.out.println("***MODO ATENDIENDO*** \nCHEFSITO ya tiene tu orden tiene que pasar a MODO COCINANDO");
    }
  }
  
  @Override
  public void cocinar(){
    if(chefsito.getPlatilloRecibido()){
      System.out.println("***MODO ATENDIENDO***\nCHEFSITO pasara a MODO COCINANDO");
      chefsito.asignarNuevoEstado(chefsito.getEstadoCocinando());
    }else{
      System.out.println("***MODO ATENDIENDO***\nCHEFSITO no tiene tu orden por lo que no puede cocinar");
    }
  }
  
  @Override
  public void entregar(){
    System.out.println("***MODO ATENDIENDO***\nCHEFSITO no puede entregar si esta atendiendo.");
  }
  
  @Override
  public void apagarse(){
    System.out.println("***MODO ATENDIENDO***\nCHEFSITO no puede suspenderse mientras atiende.");
  }
}