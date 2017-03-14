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
    
    public Explorador(City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn, 1);
        super.setSpeed(4.0);
    }
    
    public void turnRight () {
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
    }
        
    public boolean rightIsClear () {
        boolean libre = true;
        for (Thing wall: this.examineThings()) {
            //ciclo que lee todas las paredes que hay en la casilla
            if(wall.blocksIntersectionEntry(this.getDirection().right())){
                //condicional que determina si tiene la derecha libre
                libre = false;
                
            }
        }
        for (Thing wall : this.getIntersection().getNeighbor(this.getDirection().right()).examineThings()) {
            
            if (wall.blocksIntersectionEntry(this.getDirection().left())) {
                
                libre = false;
                
            }
        }
        return libre;
    }
    
    private void hacerMovimineto () {
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
//        this.putThing();
        do {
            this.hacerMovimineto();
        }while(!this.canPickThing());
        this.setLabel("Easy");
    }
}
