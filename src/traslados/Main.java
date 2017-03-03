package traslados;

public class Main {
    public static void main(String[] args) {
        Escenario e1= new Escenario();
        Traslado t1= new Traslado(e1);
        boolean[] pos = new boolean[50];
        for(int i=0;i<50;i++){
            pos[i]= false;
        }
        t1.setPos(pos);
        t1.recoleccion();
        t1.reparticion();
    }
}
