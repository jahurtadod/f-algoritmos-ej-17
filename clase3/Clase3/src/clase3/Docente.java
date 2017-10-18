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
public class Docente {
    private String apellidos;
    private Asignatura asignatura1;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }
    
    @Override
    public String toString() {
        String cadena = String.format(
                "Datos Docente\n"
                + "Apellidos %s\n"
                + "Tiene las siguiente asignatiras: "
                + "Asignatura 1 : %s", 
                this.getApellidos(),this.getAsignatura1());
        return cadena;
    }
    
    
}
