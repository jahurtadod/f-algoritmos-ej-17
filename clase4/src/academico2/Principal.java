/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico2;

/**
 *
 * @author jahur
 */
public class Principal {

    public static void main(String[] args) {
        //caso 1
        Carrera carrera = new Carrera("Presencial", "Contabilidad");

        Asignatura a = new Asignatura(carrera);

        System.out.println(a);
        //caso 2
        Carrera carrera2 = new Carrera("Distancia", "Economia");

        Asignatura a1 = new Asignatura(carrera2);

        System.out.println(a1);
        
    }
}
