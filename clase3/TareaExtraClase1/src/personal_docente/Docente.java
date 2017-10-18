/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_docente;

import institucion.Asignatura;

/**
 *
 * @author DELL
 */
public class Docente {

    private String nombres;
    private String apellidos;
    private Titulo titulo_tercer_nivel;
    private Titulo titulo_cuarto_nivel;
    private Asignatura asignatura1;
    private Asignatura asignatura2;

    public String obtener_nombre() {
        return nombres;
    }

    public void establecer_nombres(String nombres) {
        this.nombres = nombres;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void establecer_apellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Titulo obtener_titulo_tercer_nivel() {
        return titulo_tercer_nivel;
    }

    public void establecer_titulo_tercer_nivel(Titulo titulo_tercer_nivel) {
        this.titulo_tercer_nivel = titulo_tercer_nivel;
    }

    public Titulo obtener_titulo_cuarto_nivel() {
        return titulo_cuarto_nivel;
    }

    public void establecer_titulo_cuarto_nivel(Titulo titulo_cuarto_nivel) {
        this.titulo_cuarto_nivel = titulo_cuarto_nivel;
    }

    public Asignatura obtener_asignatura1() {
        return asignatura1;
    }

    public void establecer_asignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura obtener_asignatura2() {
        return asignatura2;
    }

    public void establecer_asignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    @Override
    public String toString() {
        return String.format("Datos del Docente:\n"
                + "Nombres: %s\n" + "Apellidos: %s\n"
                + "Tiene a su cargo las asignaturas:\n"
                + "    Asignatura 1: %s"
                + "    Asignatura 2: %s"
                + "El docente tiene los siguientes títulos académicos:\n"
                + "    Título 3er nivel: %s"
                + "    Título 4er nivel: %s",
                obtener_nombre(), obtener_apellidos(),
                obtener_asignatura1(), obtener_asignatura2(),
                obtener_titulo_tercer_nivel(), obtener_titulo_cuarto_nivel());
    }
}
