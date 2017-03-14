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
public class Explorador extends Robot {
    
    
      /**
 * Constructor
 * descripcion
 * @param city determina en que ciudad se la funcion
 * @param i
 * @param i1 
 * @param drctn determnina la direccion incial del robot
 */
    public Explorador(City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn, 1);
        super.setSpeed(12.5);
    }

     /**
 * turnRight
 * Robot gira a la derecha
 */
    public void turnRight () {
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
    }
    
 /**
 * rightIsClear
 * dermina si existe una pared al lado derecho del robot
 */    
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
  /**
 * hacerMovimiento
 * determina  el movimiento del robot,si debe avanzar,girar a la derecha o girar a la izquierda
 */
    private void hacerMovimiento () {
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
    /**
 * ResolverLaberinto
 * recorre el laberinto guiandose por la pared derecha
 */ 
    public void ResolverLaberinto () {
//        this.putThing();
        do {
            this.hacerMovimiento();
        }while(!this.canPickThing());
        this.setLabel("Easy");
    }
}
