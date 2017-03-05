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
public class estructuras {
    private int c=0;
    private int n;
    private int m;
    private int condicion=0;
    private City city;
    private Wall arrayObjetos[]=new Wall[36];

    public estructuras(int n, int m, City city) {
        this.n = n;
        this.m = m;
        this.city = city;
    }
    

    
    public void columnas_WEST (int coordena_x){
       for (int i=n;i<=n+4;i++){   
         c++;
         arrayObjetos[c]=new Wall(city,i,coordena_x,Direction.WEST);
         }   
    }
    
    public void columna_EAST (int coordena_x){
       for (int i=n;i<=4+n;i++){   
            c++;
         arrayObjetos[c]=new Wall(city,i,coordena_x,Direction.EAST);
         }   
    }
    
    public void piso(int coordena_x){
      c++;
      arrayObjetos[c]=new Wall(city,n+4, coordena_x, Direction.SOUTH);
      c++;
      arrayObjetos[c]=new Wall(city,n+4,coordena_x+2,Direction.SOUTH);
    }
    public void techo(int coordenada_y){
        c++;
        arrayObjetos[n]=new Wall(city,n, coordenada_y, Direction.NORTH);
    }
    
    public void laberinto(){  
        for(int j=m;j<=m+8;j++){
            this.techo(j);
            condicion=(j-m)%3;
            if (condicion==0){
              this.columnas_WEST(j);
              this.piso(j);
            }
            if (j==m+8){
              this.columna_EAST(j);
            }
  
        }
    }
}
