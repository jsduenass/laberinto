/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
import java.util.Random;
/**
 *
 * @author juan sebastian
 */
public class Estructura {
    City city;
    int n;
    int m;
    int alto;
    int largo;
    int c=0;
    int j_salida;
    int j_entrada;
    private Wall arrayObjetos[]=new Wall[100];
    
   
    
    

    public Estructura(City city, int n, int m, int alto, int largo) {
        this.city = city;
        this.n = n;
        this.m = m;
        this.largo = largo;
        this.alto = alto;  
        this.j_entrada=this.random_int(largo);
        this.j_salida=this.random_int(largo);
    }

    public int getJ_entrada() {
        return j_entrada;
    }

    public void setJ_entrada(int j_entrada) {
        this.j_entrada = j_entrada;
    }
    
    
    public int random_int (int tope) {
       Random rn = new Random();
       int answer = rn.nextInt(tope) ;
       return answer;
    } 
    
    public void columna_WEST (int fila_n,int columna_m,int alto){
       for (int i=fila_n;i<=fila_n+alto;i++){   
         c++;
         arrayObjetos[c]=new Wall(city,i,columna_m,Direction.WEST);
         }   
    }
    
    public void columna_EAST (int fila_n,int columna_m, int alto){
       for (int i= fila_n;i<=alto+fila_n;i++){   
            c++;
         arrayObjetos[c]=new Wall(city,i,columna_m,Direction.EAST);
         }   
    }
    
    public void fila_NORTH(int fila_n,int columna_m, int largo){
        for (int j=columna_m;j<=columna_m+largo;j++){   
            c++;
        arrayObjetos[c]=new Wall(city,fila_n, j, Direction.NORTH);
         }        
    }
    
     public void fila_SOUTH(int fila_n,int columna_m, int largo){
        for (int j=columna_m;j<=columna_m+largo;j++){   
            c++;
        arrayObjetos[c]=new Wall(city,fila_n, j, Direction.SOUTH);
         }        
    }
    
    
    public void marco(){
        this.columna_WEST(n,m, alto);
        this.columna_EAST(n,m+largo, alto);
        //entrada
        this.fila_NORTH(n,m, j_entrada);
        j_entrada++;
        this.fila_NORTH(n,m+j_entrada+1, largo-1-j_entrada);
        //salida
        this.fila_SOUTH(n+alto,m, j_salida);
        j_salida++;
        this.fila_SOUTH(n+alto,m+j_salida+1, largo-1-j_salida);
        
    }
    
}
