
package Organizador;

import becker.robots.*;

public class Campo extends City{
    
    java.util.Random rand = new java.util.Random();
        
    private Thing[][] cosecha;//matriz de las cosas en el campo

    public Campo() {
        super();
        int[] cosas;//arreglo que da el numero de cosas de cada columna
        int columnas = rand.nextInt(10)+1;
        cosecha = new Thing[columnas][10];
        cosas = new int [columnas];
        //genera al azar el numero de columnas 
        for(int i = 0; i < columnas; i++){
            cosas[i] = rand.nextInt(10)+1;
        }
        //genera al azar la cantidad de objetos de cads columna
        for(int k = 0; k < columnas; k++){
            //cosecha[k] = new Thing[cosas[k]];
            for (int l = 0; l < cosas[k]; l++){
                cosecha[k][l] = new Thing(this, 11-l, 2+k);
            }
        }
        //inicializa cada cosa en al ciudad
    }

    public Thing[][] getCosecha() {
        return cosecha;
    }

    public void setCosecha(Thing[][] cosecha) {
        this.cosecha = cosecha;
    }
        
}
