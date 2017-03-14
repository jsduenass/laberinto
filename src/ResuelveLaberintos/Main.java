/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResuelveLaberintos;

import becker.robots.Direction;
import java.util.*;

/**
 *
 * @author Bencardino Perdomo
 */
public class Main {  
        
    public static void main(String[] args) { //aasadsdf
        
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            
            int max = 18;
            int numCalles = rand.nextInt(max) +2;
            int numAvenidas = rand.nextInt(max) +2;
            double twistines = rand.nextDouble();
            double ramificacion = rand.nextDouble();
            
            Laberinto nacho = new Laberinto(numCalles, numAvenidas, twistines, ramificacion);
            Explorador andrew = new Explorador(nacho, numCalles - 1, 0, Direction.EAST);
            andrew.ResolverLaberinto();
        }
        
    }
    
}
