
package Organizador;

public class Main {
    
    public static void main(String[] args) {
        
        Campo campo = new Campo();
        Organizador Juan = new Organizador(campo);
        
        Juan.ordenarCampo();
    }
    
}
