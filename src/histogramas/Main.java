package histogramas;

public class Main {
    
    public static void main(String []args){
        System.out.println("prueba de versiones");
        Patron p1= new Patron();
        Histograma h1= new Histograma(p1);
        h1.repartir();    
    }
}
