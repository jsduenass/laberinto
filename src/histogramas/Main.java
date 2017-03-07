package histogramas;

public class Main {
    
    public static void main(String []args){
        Patron p1= new Patron();
        Histograma h1= new Histograma(p1);
        h1.repartir();    
    }
}
