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
public class movimiento {
    Robot robot;

    public movimiento(Robot robot) {
        this.robot = robot;
    }
    
    
    
     public void mover(Robot robot,int n){
       for (int i=0;i<n;i++){
           robot.move();
        }
    }
     
    public  void right(Robot robot){
     robot.turnLeft();
     robot.turnLeft();
     robot.turnLeft();
   }
    public void left(Robot robot){
     robot.turnLeft();
   }
   public void see(Robot robot){
       for (int i=0; i<1;i--){
           
       if (robot.frontIsClear()){
           this.mover(robot, 1);
        } else{ this.left(robot);}
    }
   }
       
}
                  