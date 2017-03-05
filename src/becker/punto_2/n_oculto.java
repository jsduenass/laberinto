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
public class n_oculto {
    private puntos_2 puntos;
    public  boolean cadena [][];
    private String codigo="";
    private String cambio;
    private String numero ;

    public n_oculto(puntos_2 puntos ) {
        this.puntos = puntos;
        
    }
    
    

    public void setCadena(boolean[][] cadena) {
        this.cadena = cadena;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCambio() {
        return cambio;
    }
    

    
    /*
    public void to_matriz(int n,int l,int i,int j, boolean [][]b){
        char[]caracter;
        codigo= codificar(n);
        caracter= codigo.toCharArray();
        if( caracter[l]== 1){b[i][j]= true;} else {b[i][j]= false;}
        
    }*/
    public void decodificar(int i,int j,boolean [][] matriz_b){
        this.setCadena(matriz_b);
        if(cadena[i][j]==true) cambio="1";else cambio="0";
        codigo+=cambio;
       
    }

   
    
    public String identificador(){
        switch (codigo){
        case "0111110000000": 
                numero = "1";
                break;
        case "1101111101111": 
                numero = "2";
                break;
        case "1111111101101": 
                numero = "3";
                break;
        case "0111110111100": 
                numero = "4";
                break;
        case "1111011111101": 
                numero = "5";
                break;
        case "1111011111111":  
                numero = "6";
                break;
        case "0111111100000": 
                numero = "7";
                break;
        case "1111111111111": 
                numero = "8";
                break;
        case "1111111111101":
                numero = "9";
                break;
        case "1111111110111": 
              numero = "0";
              break;
        default :
            numero="null";
            break;
                
    }
        
        return numero;
    }

  
}
