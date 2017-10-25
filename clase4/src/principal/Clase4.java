package principal;

import carrera.Carrera;

/**
 *
 * @author jahur
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carrera c = new Carrera();
        
        c.establecer_nombre("Informatica");
        c.establecer_modalidad("Distancia");
        System.out.println(c.obtener_modalidad());
        
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2.obtener_modalidad());
        
        Carrera c3 = new Carrera("Semipresencial", "Sistemas");
        System.out.println(c3.obtener_modalidad());
        c3.establecer_modalidad("Distancia");
        System.out.println(c3.obtener_modalidad());
        System.out.println(c3.obtener_modalidad().toUpperCase());
    }
    
}
