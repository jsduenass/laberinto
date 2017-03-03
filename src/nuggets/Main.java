package nuggets;

public class Main {
    
    public static void main(String[] args) {
        Laberinto lab= new Laberinto();    
        Recoleccion r= new Recoleccion(lab);    
        r.recorrido();
    }
    
}
