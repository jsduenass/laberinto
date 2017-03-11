/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
import static java.lang.Thread.sleep;
import java.util.Random;
import javafx.scene.paint.Color;
/**
 *
 * @author juan sebastian
 */
public class board {
    City city;
    int n=12;
    int m=23;
    dot dot[][][]= new dot [n+1][m+1][2];
    

    public board(City city) throws InterruptedException {
        this.city = city;
         for(int j=0;j<m;j++){
            for (int i=0;i<n;i++){
               dot[i][j][0]= new dot (this.city, i, j);
                dot[i][j][0].set_value(false); 
                //sleep(100);
            }
        }
    }
    
     public void insert(int i, int j) throws InterruptedException{
        dot[i][j][0]= new dot(city,i,j);
        dot[i][j][0].set_value(true);
        //sleep(100);
    }
     
    public void insert_random () throws InterruptedException{
        for(int j=0;j<m;j++){
            for (int i=0;i<n;i++){
               Random rn = new Random();
               int answer = rn.nextInt(9) ;
               if(answer<3){
               this.insert(i, j);
               }
            }
        }
    }  
    public void game_of_life() throws InterruptedException{
        sleep(1000);
        for(int j=0;j<m;j++){
            for (int i=0;i<n;i++){
                int c=0;
                
                for(int a=-1;a<2;a+=1){
                    for (int b=-1;b<2;b+=1){
                        
                        if(0<=a+i&&a+i<n&&0<=b+j&&b+j<m){
                            
                            if(dot[i+a][j+b][0].get_bool())   {
                           c++;
                           //dot[i+a][j+b][0].marcador();
                           
                        }
                        }
                                 
                    }
                   
                }
                
                dot[i][j][1]= new dot (this.city, i, j);
               // sleep(500);
                this.state(dot[i][j][0], dot[i][j][1], c);
            }
        }
        
        
    }
    
   
    public void state (dot punto0,dot punto1 ,int c){
        if(c==4){
            punto1.set_value(true);
        }
        else if(c==3){
            punto1.set_value(punto0.get_bool());
        }else{
            punto1.set_value(false);
        }
    }
 
    
    public void igualar (){
        for(int j=0;j<m;j++){
            for (int i=0;i<n;i++){
               dot[i][j][0]=  dot[i][j][1];                 
            }
        }
        
    }
     
    public void final_game () throws InterruptedException{
        Robot robert = new Robot (city, 1, 11, Direction.NORTH,9);
        sleep(2000);
        for(int contador=0;contador>=0;contador++){
             robert.setLabel(contador+"");
            this.game_of_life();
            this.igualar();
            sleep(500);
           
        }
    }
    
    
    public void alive(int i, int j,dot[][][] arreglo_dot1,dot punto){
        arreglo_dot1=this.dot;
        //arreglo_dot1[i][j][0];
        for(int a=-1;a<2;a+=2){
            for (int b=-1;b<2;b+=2){
               //if(dot[i][j][0])            
            }
        }
        
        
       
        
    }
    
    
}
