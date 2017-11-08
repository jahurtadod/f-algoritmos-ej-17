/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author jahur
 */
public class Asignatura_Distancia extends Asignatura{
    
    private int numero_creditos;

    public Asignatura_Distancia(String nombre, String tipo, double costo, int numero_creditos) {
        super(nombre, tipo, costo);
        this.setNumero_creditos(numero_creditos);
    }

    public int getNumero_creditos() {
        return numero_creditos;
    }

    public void setNumero_creditos(int numero_creditos) {
        this.numero_creditos = numero_creditos;
    }

    @Override
    public String toString() {
        return String.format("Asignatura Distancia:\n\t %s \n\t %d",
                super.toString(), this.getNumero_creditos());
    }
    
}
