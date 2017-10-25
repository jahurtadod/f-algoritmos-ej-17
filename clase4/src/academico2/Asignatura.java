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
public class Asignatura {

    private String nombre;
    private int creditos;
    private Carrera carrera;

    public Asignatura(Carrera carrera) {
        this.carrera = carrera;
        this.creditos = 5;
        this.nombre = "Informatica";
    }

    public String obtener_nombre() {
        return nombre;
    }

    public int obtener_creditos() {
        return creditos;
    }

    public Carrera obtener_carrera() {
        return carrera;
    }


    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecer_creditos(int creditos) {
        this.creditos = creditos;
    }

    public void establecer_carrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        String cadena = String.format("Asignatura: \n"
                + "\tNombre: %s\n"
                + "\tCréditos: %s\n"
                + "%s",
                obtener_nombre(), obtener_creditos(), obtener_carrera());
        return cadena;
    }
}
