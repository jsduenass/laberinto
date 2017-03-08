package Punto7;

import becker.robots.*;

public class Main {
    public static void main(String[] args) {
        Cuarto cuarto = new Cuarto();
        Robot bencardinito=new Robot(cuarto.getCity(),11,6,Direction.NORTH);
        Limpiador l1= new Limpiador(bencardinito);
        l1.limpiarsala();
    }
}
