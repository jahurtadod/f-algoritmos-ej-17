/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herencia4.Asignatura_Presencial;
/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante("Jorge", "Hurtado", 15, 2);
        Asignatura_Presencial a1 = new Asignatura_Presencial("Program", "Comun", 100, 180);
        Asignatura_Presencial a2 = new Asignatura_Presencial("Literatura", "Troncal", 300, 200);
        e.setAsignaturas(0, a1);
        e.setAsignaturas(1, a2);
        
        System.out.println(e);
        
    }
    
}
