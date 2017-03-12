/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResuelveLaberintos;

import becker.robots.*;

/**
 *
 * @author Bencardino Perdomo
 */
public class Explorador extends Robot{
    
    public Explorador(City city, int i, int i1, Direction drctn, int i2) {
        super(city, i, i1, drctn, i2);
        super.setSpeed(4.0);
    }
    
    public void turnRight () {
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
    }
    
    public Direction dirDerecha () {
        //función que devulve que direccion está a la derecha del robot        
        switch (this.getDirection()){
            
            case EAST:
                return Direction.SOUTH;                
            
            case SOUTH:
                return Direction.WEST;
            
            case WEST:
                return Direction.NORTH;
            
            case NORTH:
                return Direction.EAST;
                
            default:
                return null;          
        }        
    }
        
    public boolean rightIsClear () {
        boolean libre = true;
        for (Thing wall: this.examineThings(IPredicate.aWall)) {
            //ciclo que lee todas las paredes que hay en la casilla
            if(wall.blocksIntersectionExit(this.dirDerecha())){
                //condicional que determina si tiene la derecha libre
                libre = false;
            }
        }
        return libre;
    }
    
    public void hacerMovimineto () {
        if (this.rightIsClear()) {
            //si no tiene pared a la derecha gira a la derecha
            this.turnRight();
            this.move();
        } else if (this.frontIsClear()){
            //si tiene pared a la derecha pero nada al frente
            this.move();
        } else {
            //si tiene pared al frente y a la derecha
            this.turnLeft();
        }
    }
    
    public void ResolverLaberinto () {
        while(!this.canPickThing()){
            this.hacerMovimineto();
        }
        this.setLabel("Easy");
    }
}
