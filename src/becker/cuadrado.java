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
public class cuadrado {
    City city;
    int i;
    int j;
    int sentido;


    public cuadrado(City city, int i, int j, int sentido) {
        this.city = city;
        this.i = i;
        this.j = j;
    }
    public void mover(int direction){
        if(direction==1){
            this.j+=sentido;
        }
        if(direction==2){
            this.i+=sentido;
        }
    }
    
    public void determinar (int direction, int turn){
     if (turn==0){
            turn+=2;
        }   
    }
    
    public void identificar (int direction, int turn){
        this.mover(1);
        if (direction==0 &&turn==0){
            this.a();
            this.b();
        }else
        if (direction==1 &&turn==0){
            this.c();
            this.b();
        }else
        if (direction==0 && turn==1){
            this.d();
            this.b();
        }else
        if (direction==1 && turn==1){
            this.a();
            this.c();
        }else
        if (direction==0 && turn==2){
            this.a();
            this.d();
        }else
            if (direction==1 && turn==2){
            this.c();
            this.d();
        }
        
     }
    
    
    public void a(){
    Wall pared=new Wall(city,i,j,Direction.NORTH);
    }
    
    public void b(){
    Wall pared=new Wall(city,i,j,Direction.EAST);
    }
    public void c(){
    Wall pared=new Wall(city,i,j,Direction.SOUTH);
    }
    
     public void d(){
    Wall pared=new Wall(city,i,j,Direction.WEST);
    }
    
   
    
}
