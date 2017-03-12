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
      int n=0;
      int m=2;
      int j_entrada;
      n++;m++;

      
      City prague = new City();
     
      
      
     Estructura laberinto= new Estructura (prague,n,m,10,10);
     j_entrada=laberinto.getJ_entrada();
     laberinto.marco();
     Robot karel = new Robot(prague, n-1, m+j_entrada+1, Direction.SOUTH,5);
     
    movimiento mover= new movimiento(karel);
    mover.resolver_lab();
      
   }

   
  
}
