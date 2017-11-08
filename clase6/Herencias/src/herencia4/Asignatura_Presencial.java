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
public class Asignatura_Presencial extends Asignatura {

    private int numero_horas;

    public Asignatura_Presencial(String nombre, String tipo, double costo, int numero_horas) {
        super(nombre, tipo, costo);
        this.setNumero_horas(numero_horas);
    }

    public int getNumero_horas() {
        return numero_horas;
    }

    public void setNumero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }

    @Override
    public String toString() {
        return String.format("Asignatura Precencial:\n\t %s \n\t %d\n",
                super.toString(), this.getNumero_horas());
    }
}