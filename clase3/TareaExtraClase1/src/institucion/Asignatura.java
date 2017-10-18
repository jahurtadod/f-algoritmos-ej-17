/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author DELL
 */
public class Asignatura {
    
    private String  nombre;
    private int     creditos;

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtener_creditos() {
        return creditos;
    }

    public void establer_creditos(int creditos) {
        this.creditos = creditos;
    }
    
    @Override
    public String toString() {
        return String.format("%s con número de créditos %d\n", obtener_nombre(),obtener_creditos());
    }
    
}
