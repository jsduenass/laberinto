
package Punto7;

import becker.robots.*;

public class Limpiador {
   
    private Robot robot;

    public Limpiador(Robot robot) {
        this.robot = robot;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
        
    public void movefront(int n){
        for(int i=0;i<n;i++){
            if(robot.canPickThing()){
                robot.pickThing();
            }
            robot.move();
        }
    }
    
    public void limpiarsala(){
        for(int i=0;i<3;i++){
            limpiarcuarto();
        }
        limpiarcuartoraro();
    }
    
    public void limpiarcuartoraro(){
        movefront(11);
        moveleft(1);
        moveleft(1);
        limpiarU();
        moveleft(1);
        moveleft(3);
        moveright(1);
        moveleft(1);
        moveright(1);
        moveright(2);
        moveright(1);
        moveleft(2);
        moveleft(1);
        moveleft(1);
        moveright(1);
        moveright(1);
        moveleft(1);
        moveleft(5);
        moveleft(2);
    }
    
    public void limpiarcuarto(){
        movefront(11);
        moveleft(1);
        moveleft(1);
        for(int i=0;i<3;i++){
            limpiarU();
            moveleft(1);
            robot.turnLeft();
        }
        movefront(5);
        moveleft(2);
    }
    
    public void limpiarU(){
        movefront(4);
            if(robot.canPickThing()){
                robot.pickThing();
            }

        moveright(1);
        moveright(4);
            if(robot.canPickThing()){
                robot.pickThing();
            }

    }
    
    public void moveright(int n){
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
        for(int i=0;i<n;i++){
            if(robot.canPickThing()){
                robot.pickThing();
            }
            robot.move();
        }
    }
    
    public void moveleft(int n){
        robot.turnLeft();
        for(int i=0;i<n;i++){
            if(robot.canPickThing()){
                robot.pickThing();
            }
            robot.move();
        }
    }
    
    
    
}