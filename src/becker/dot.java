/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
import static java.lang.Thread.sleep;
import javafx.scene.paint.Color;
/**
 *
 * @author juan sebastian
 */
public class dot {
    City city;
    int n;
    int m;
    Thing dot;
    boolean b=false;
    

    public dot(City city, int n, int m) {
        this.city = city;
        this.n = n;
        this.m = m;
        this.dot=new Thing(city,n,m);
       
    }
    
   
   
    
    public boolean get_bool() {
        return b;
    }

    public void set_bool(boolean b) {
        this.b = b;
    }
    
    
   
    public void set_value (boolean b){
        if (b==true){
           dot.setColor(java.awt.Color.BLACK); 
        } else { 
            dot.setColor(java.awt.Color.LIGHT_GRAY);
        }
        this.b=b;
    }
    public void marcador () throws InterruptedException{
        dot.setColor(java.awt.Color.red);
        sleep(1000);
        
    }
    
}
