package Jugar_futbol;

import becker.robots.*;

public class Futbol {

    private City ciudad;
    private Robot robot;
    private Thing balon;

    public Futbol() {
        this.ciudad = new City();
        this.robot = new Robot(ciudad,5,9,Direction.WEST);
        this.balon = new Thing(ciudad,5,8);
    }
    
    public void jugar(){
            advance(1);
        robot.pickThing();
        advance(1);
        derecha(1);
        izquierda(2);
        derecha(1);
        izquierda(2);
        izquierda(1);
        derecha(2);
        robot.putThing();
    }
    public void advance(int n){
        for(int i=0;i<n;i++){
            this.robot.move();
        }
    }
    public void izquierda(int n){
        robot.putThing();
        robot.pickThing();
        this.robot.turnLeft();
        for(int i=0;i<n;i++){
            this.robot.move();
        }
    } 
    public void derecha(int n){
        robot.putThing();
        robot.pickThing();
        this.robot.turnLeft();
        this.robot.turnLeft();
        this.robot.turnLeft();
        for(int i=0;i<n;i++){
            this.robot.move();
        }
    } 
    
    
}
