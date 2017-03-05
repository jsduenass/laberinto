/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker.punto_2;

/**
 *
 * @author juan sebastian
 */
public class segmento {
 
private puntos_2 puntos;
private boolean b[][]=new boolean [5][3];

    public segmento() {
       
    }

    public boolean[][] getB() {
        return b;
    }

    
    public void a(){
        int i=0;
        for(int j=0;j<3;j++){b[i][j]=true;}
        
    }
    public void g(){
        int i=2;
        for(int j=0;j<3;j++){b[i][j]=true;}
        
    }
    public void d(){
        int i=4;
        for(int j=0;j<3;j++){b[i][j]=true;}   
    }
    
    public void f(){
        int j=0;
       for(int i=0;i<3;i++){b[i][j]=true;}
        
    }
    
    public void b(){
        int j=2;
        for(int i=0;i<3;i++){b[i][j]=true;}
      
    }
    
    public void e(){
        int j=0;
       for(int i=2;i<5;i++){b[i][j]=true;}
        
    }
     
    public void c(){
        int j=2;
        for(int i=2;i<5;i++){b[i][j]=true;}
      
    }
    
    
    
    public void codificar (int n){
        switch (n){
        case 1: 
                this.c();
                this.b();
                break;
        case 2: 
                this.a();
                this.b();
                this.d();
                this.e();
                this.g();
                
                break;
        case 3: 
                this.a();
                this.b();
                this.c();
                this.d();
                this.g();
                break;
        case 4: 
                this.b();
                this.c();
                this.f();
                this.g();
                break;
        case 5: 
                this.a();
                this.c();
                this.d();
                this.f();
                this.g();
                break;
        case 6:  
                this.a();
                this.c();
                this.d();
                this.e();
                this.f();
                this.g();
                break;
        case 7: 
                this.a();
                this.b();
                this.c();
                break;
        case 8: 
                this.a();
                this.b();
                this.c();
                this.d();
                this.e();
                this.f();
                this.g();
                break;
        case 9:
                this.a();
                this.b();
                this.c();
                this.d();
                this.f();
                this.g();
                break;
        case 0: 
              this.a();
                this.b();
                this.c();
                this.d();
                this.e();
                this.f();
              break;
        default :
            
            break;
        } 
                
    }

}
