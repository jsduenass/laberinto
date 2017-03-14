/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;

import becker.robots.*;

/**
 *
 * @author juan sebastian
 */
public class laberinto {
    
    public static void main(String[] args) throws InterruptedException
   {  
     // Set up the initial situation
      int n=2;
      int m=2;
      int j_entrada;
      City prague = new City();
      
     
      
      
     Estructura laberinto= new Estructura (prague,n,m,4,10);
     j_entrada=laberinto.getJ_entrada();
     //laberinto.marco();
     Robot karel = new Robot(prague, n-1, m+j_entrada+1, Direction.SOUTH,5);
     Thing cosa= new Thing(prague,n+1,m+j_entrada+2);
    cuadrado cuadro= new cuadrado(prague,2,2,1);
    cuadro.identificar(1, 1);
    cuadro.identificar(1, 0);
    
    movimiento mover= new movimiento(karel);
    mover.resolver_lab();
      
   }

   
  
}
