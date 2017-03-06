
package Organizador;

import becker.robots.*;

public class Organizador extends Robot {
    
    private int numColumnas;
    private int[] columna;

    public Organizador(Campo city) {
        super(city, 2, 11, Direction.EAST);
        this.numColumnas = 0;
        this.columna = new int[10];
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    public int[] getColumna() {
        return columna;
    }

    public void setColumna(int[] columna) {
        this.columna = columna;
    }
    
    public int getUnaColumna (int i) {
        return columna[i];        
    }
    
    public void setUnaColumna (int Objetos, int i) {
        this.columna[i] = Objetos;
    }
    
    public void LeerColumna (int ColumnaNum) {
        int contador = 0;
        this.turnLeft();
        while (this.canPickThing() && contador <= 10){
        //mientras pueda recoger y la columna tenga 10 o menos cosas
            this.pickThing();
            this.move();
            contador++;
        }
        this.setUnaColumna(contador, ColumnaNum);
        this.turnLeft();
        this.turnLeft();
        //gira 180 grados para devolverse
        for (int i = 0; i<contador; i++){
            this.move();
            //se devuelve el numero de pasos que adelantó
        }
        this.turnLeft();
        this.move();
        //giro y avance para que pueda empezar la siguiente columna
    }
    
    public void LeerCampo () {
        int contador = 0;
        while(this.canPickThing() && contador <= 10){
            this.LeerColumna(contador);
            //recorre todo el campo recogiendo cada columna
        }
        this.turnLeft();
        this.turnLeft();
        for (int i = 0; i<contador; i++){
            this.move();
            //vuleve al lugar donde inicio
        }
        this.turnLeft();
        this.turnLeft(); 
        //se vuelce a orientar a la posición de inicio
        this.setNumColumnas(contador);
        int[] col = new int[this.numColumnas];
        System.arraycopy(this.columna, 0, col, 0, contador);
        this.setColumna(col);
    }
    
    public void OrdenarCol (int Left, int Right) {
        int i = Left, j = Right;
        int temp;
        int referencia = this.columna[(Left+Right)/2];
        
        //partición
        
        while (i<=j){
            while (this.columna[i] < referencia) i++;
            while (this.columna[j] > referencia) j++;
            if(i<=j){
                temp            = this.columna[i];
                this.columna[i] = this.columna[j];
                this.columna[j] = temp;
                i++;
                j++;
            }
        }
        
        //recursividad
        
        if (Left < j){
            OrdenarCol(Left, j);
        }
        if (i < Right){
            OrdenarCol(i, Right);
        }
    }
    
    public void OrdenarColumnas () {
        this.OrdenarCol(0, numColumnas-1);        
    }
    
    public void ponerColumna (int columna){
        this.turnLeft();
        for (int i = 0; i < this.columna[columna]; i++){
            this.putThing();
            this.move();
        }
        //deja todos las cosas de la columna
        this.turnLeft();
        this.turnLeft();
        for (int j = 0; j < this.columna[columna]; j++){
            this.move();
        }
        //se devuelve al inicio
        this.turnLeft();
        this.move();
        //se posiciona para empezar la siguiente columna        
    }
    
    public void ponerCampo () {
        for (int i = 0; i < this.numColumnas; i++){
            ponerColumna(i);
        }
        this.turnLeft();
        this.turnLeft();
        for (int j = 0; j < this.numColumnas; j++){
            this.move();
        }
        this.turnLeft();
        this.turnLeft();
    }
    
    public void ordenarCampo () {
        this.LeerCampo();
        this.OrdenarColumnas();
        this.ponerCampo();
    }
}
