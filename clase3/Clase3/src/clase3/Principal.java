/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author jahur
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Asignatura a1 = new Asignatura();
        a1.setNombre("Matemáticas");
        a1.setCreditos(9);
        
        Docente d1 = new Docente();
        d1.setApellidos("Luis V.");
        d1.setAsignatura1(a1);
        
        System.out.println(d1);
        
    }
    
}
