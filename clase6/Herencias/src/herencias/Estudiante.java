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
public class Estudiante extends Persona{
    
    private Asignatura_Presencial[] asignaturas;
    
    public Estudiante(String n, String a, int e, int n_a){
        super(n, a, e);
        this.asignaturas = new Asignatura_Presencial[n_a];
    }

    public String getAsignaturas() {
        String result = "";
        for (Asignatura_Presencial asignatura: this.asignaturas) {
            result += asignatura;
        }
        return result;
    }

    public void setAsignaturas(int i, Asignatura_Presencial asignatura) {
        this.asignaturas[i] = asignatura;
    }
    
    public double obtener_valor_matricula(){
        double valor = 0;
        for (Asignatura_Presencial asignatura : this.asignaturas) {
            valor += asignatura.getCosto();
        }
        return valor;
    }
    
    @Override
    public void setEdad (int n){
        if (n < 18){
            this.edad = 18;
        }else{
           this.edad = n; 
        }    
    }
    
    @Override
    public String toString(){
        return String.format("%sCosto Matricula: %f \nListado de Asignaturas: \n%s", 
                super.toString(), this.obtener_valor_matricula(), this.getAsignaturas());
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
