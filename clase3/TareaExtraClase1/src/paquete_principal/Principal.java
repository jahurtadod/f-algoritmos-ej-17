/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import institucion.Asignatura;
import personal_docente.Docente;
import personal_docente.Titulo;

/**
 *
 * @author DELL
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matemáticas");
        a1.establer_creditos(8);
        
        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Física");
        a2.establer_creditos(6);
        
        Titulo t1 = new Titulo();
        t1.establecer_nombre("Licenciado en Físico-Matemáticas");
        t1.establecer_nombre_universidad("Universidad Politécnica");
        
        Titulo t2 = new Titulo();
        t2.establecer_nombre("Magister en Docencia Matemática");
        t2.establecer_nombre_universidad("Universidad Valenciana");
        
        Docente d1 = new Docente();
        
        d1.establecer_nombres("Luis V.");
        d1.establecer_apellidos("Perez J.");
        d1.establecer_asignatura1(a1);
        d1.establecer_asignatura2(a2);
        d1.establecer_titulo_tercer_nivel(t1);
        d1.establecer_titulo_cuarto_nivel(t2);
        
        System.out.println(d1);

        a1.establecer_nombre("Sociales");
        a1.establer_creditos(9);
        
        a2.establecer_nombre("Literatura");
        a2.establer_creditos(10);
        
        t1.establecer_nombre("Licenciado en Ciencias Sociales");
        t1.establecer_nombre_universidad("Universidad Politécnica");

        t2.establecer_nombre("Magister en Docencia Social");
        t2.establecer_nombre_universidad("Uniersidad Cataluña");
        
        Docente d2 = new Docente();
        
        d2.establecer_nombres("Ana M.");
        d2.establecer_apellidos("Velez P."); 
        d2.establecer_asignatura1(a1);
        d2.establecer_asignatura2(a2);
        d2.establecer_titulo_tercer_nivel(t1);
        d2.establecer_titulo_cuarto_nivel(t2);
        
        System.out.println(d2);
        
    }
    
}
