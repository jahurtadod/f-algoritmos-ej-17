/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author jahur
 */
public final class Profesor extends Persona {

    private double sueldo;

    public Profesor() {
        super("Rene", "Elizalde", 34);
        this.setSueldo(1000.01);
    }

    public Profesor(float s) {
        super("Rene", "Elizalde", 34);
        this.setSueldo(s);
    }

    public Profesor(String n, String a, int e, float s) {
        super(n, a, e);
        this.setSueldo(s);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public void setEdad (int n){
        if (n < 30){
            this.edad = 30;
        }else{
           this.edad = n; 
        }    
    }
    
    @Override
    public String toString() {
        return String.format("Profesor:\n %s - Sueldo %f",
                super.toString(), getSueldo());
    }

}
