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
public class puntos_2 {
    private City city;
    private int l=0;
    private int n=0;
    private int m=0;
    private boolean b[][]= new boolean [5][3];
   
    Thing object[][]=new Thing[5][3];
   

    public puntos_2(City city) {
        this.city = city;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public boolean[][] getB() {
        return b;
    }
    
    public  boolean setnumero(int n) {
        
    return Math.random() < 0.82;
     }
    
    public  boolean set_random() {    
     return Math.random() < 0.82;
    }
    
    public void setb(segmento segmento){
       this.b= segmento.getB(); 
    }
    
    public void setb_2(){
        for(int j=0;j<3;j++){
            for(int i=0;i<5;i++){
                b[i][j]=this.set_random();
               if(j==1&&(i==1||i==3)){
                   b[i][j]=false;
               }     
            }
        }      
    }
    
    public void condicion(int i, int j,int x, int y){
    if (b[i][j]==true){
        n=x+i;
        m=y+j;
        object[i][j]= new Thing (city,n,m);
        
     }
    
}
    public void crear_thing( int x,int y){
    
        for(int j=0;j<3;j++){
            for(int i=0;i<5;i++){
                this.condicion(i,j,x,y);
            }
        }
    }
    
}
