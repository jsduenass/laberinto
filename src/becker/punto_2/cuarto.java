/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker.punto_2;
import becker.robots.*;
/**
 *
 * @author juan sebastian
 */
public class cuarto {
    private int x_robot=0;
    private int y_robot=0;
    private int n;
    private int m;
    private String salida;
   
   
    
    puntos_2 puntos;
    n_oculto oculto= new n_oculto (puntos);
    private Robot robot;
    public int c=0;
    boolean b[][];

    public cuarto(int n, int m, puntos_2 puntos, Robot robot) {
        this.n = n;
        this.m = m;
        this.puntos = puntos;
        this.robot = robot;
    }

   

    public void setB(boolean[][] b) {
        this.b = b;
    }
    

    public String getSalida() {
        return salida;
    }

    
   
    
    public void right (){
       for(int i=0; i<3; i++)robot.turnLeft();
    }
    
    public void left (){
        robot.turnLeft();   
    }
    public void mover(){
        
            
        x_robot=robot.getStreet()-n;
        y_robot=robot.getAvenue()-m;
        c++;
        this.setB(puntos.getB());
       oculto.decodificar(x_robot, y_robot, puntos.getB());
       
       
       
       //robot.setLabel( b[x_robot][y_robot]+""); 
       robot.setLabel( oculto.getCodigo());
       robot.move();
        
    }
    
    public void back(){
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
        this.mover();
        robot.turnLeft();
      
    }
    
    public void marco (){
        c=0;
        int largo=2, alto=4;
        this.mover();
        this.left();
        for(int i=0; i<alto;i++) {this.mover();}
        this.left();
        for(int i=0; i<largo;i++) {this.mover();}
        this.left();
        for(int i=0; i<alto;i++) {
           this.mover();
           if(i==(1))this.back();       
        }
        this.left();
        this.mover();
        salida= oculto.identificador();
        robot.setLabel( oculto.identificador());
    }
    
}
