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
      int m=3;

      
      City prague = new City();
     
      Robot karel = new Robot(prague, n, m, Direction.EAST,5);
     estructuras laberinto= new estructuras(n,m,prague);
      laberinto.laberinto();
      movimiento mover= new movimiento(karel);
      
      board tablero =new board (prague);
      tablero.insert_random();
     
      mover.see(karel);
     
      
      System.out.println(karel.countThingsInBackpack());
   }

   
  
}
