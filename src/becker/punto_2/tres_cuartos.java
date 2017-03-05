/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker.punto_2;
import becker.robots.*;
import java.util.Random;
/**
 *
 * @author juan sebastian
 */
public class tres_cuartos {
    
    private Robot robot;
    private City city;
    private cuarto cuarto[]=new cuarto[3];
    private puntos_2 puntos[] = new puntos_2[3];
    private segmento seg[]=new segmento [3];
    private String resultado;
    private int number0=random(),  number1=random(), number2=random();
     
    public tres_cuartos(City city,Robot robot,int n, int m ) {
        this.city=city;
        this.robot = robot;
        
        for(int i=0;i<3;i++){
         puntos[i]=new puntos_2(city);
        
         seg[i]= new segmento ();
        if(i==0){
            seg[i].codificar(number0);
            
        }else if(i==1){
            seg[i].codificar(number1);
        }else{
            seg[i].codificar(number2);
        }
        
         puntos[i].setb(seg[i]);
         puntos[i].crear_thing(n, m+3*i);

         cuarto[i]= new cuarto(n,m+3*i,puntos[i],robot);
         cuarto[i].getSalida();
         
         
         }
        
    }
     
    public int random(){
         Random rn = new Random();
         int answer = rn.nextInt(9) ;
          return answer;
     }
     
    public void set_number(int number0, int number1,int number2){
        this.number0= number0;
        this.number1=number1;
        this.number2=number2;
    }

    
    
     
     public void resultado (){
         resultado= (cuarto[0].getSalida()+cuarto[1].getSalida()+cuarto[2].getSalida());
         robot.setLabel(resultado);
     }
     
     public void entrar(){
        robot.move();
        cuarto[0].right();
        
         
     }
     public void salir (){
       
        cuarto[0].right();
        robot.move();
        cuarto[0].left();
        for(int i=0;i<3;i++) robot.move();
        cuarto[0].left();
        
     }
     public void circuito(){
        for(int i=0;i<3;i++){
         this.entrar();
         cuarto[i].marco();
         this.salir();
         }
         
     }
    
    
}
