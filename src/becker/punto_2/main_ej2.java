/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker.punto_2;
import becker.robots.*;
import java.awt.Color;
/**
 *
 * @author juan sebastian
 */
public class main_ej2 {
    
     public static void main(String[] args)
   {  
     // Set up the initial situation
      int n=2;
      int m=3;
      City prague = new City();

      estructuras laberinto= new estructuras(n,m,prague);
      laberinto.laberinto();
    
      Robot easy= new Robot (prague, n+5, m+1, Direction.NORTH,9);
      easy.setColor(Color.blue);
      
      tres_cuartos m1 =new tres_cuartos(prague,easy,n,m);
      m1.circuito();
      m1.resultado();
   }
    
}
