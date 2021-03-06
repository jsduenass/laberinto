/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResuelveLaberintos;

import becker.robots.*;
import java.awt.Color;

/**
 *
 * @author Bencardino Perdomo
 */
public class Laberinto extends MazeCity {

    private Thing salida;

    public Laberinto(int i, int i1, double d, double d1) {
        super(i, i1, d, d1);
        this.salida = new Thing(this, 0, i1-1);
        this.salida.setColor(Color.BLUE);
    }

    public Thing getSalida() {
        return salida;
    }

    public void setSalida(Thing salida) {
        this.salida = salida;
    }
    
}
