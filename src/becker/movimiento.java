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
    
    
    
     public void mover(int n){
       for (int i=0;i<n;i++){
           robot.move();
        }
    }
     
   
    public void right (){
       for(int i=0; i<3; i++)robot.turnLeft();
    }
    
    public void left (){
        robot.turnLeft();   
    }
   public void resolver_lab(){
       this.mover(1);
      
       for (int i=0; i<1;i--){
           
       if (robot.frontIsClear()){
            this.mover(1);   
        } else{ this.left();}
    }
   }
       
}
                  