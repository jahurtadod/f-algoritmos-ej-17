/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclases2;

/**
 *
 * @author jahur
 */
public class Computadora {
    
    private double velocidadProcesador;
    
    public void setVelocidadProcesador (double velocidadProcesador){
        if (velocidadProcesador > 5) {
            this.velocidadProcesador = 5.0;
        }else {
            this.velocidadProcesador = velocidadProcesador;
        }
    }
    
    public double getVelocidadProcesador() {
        return this.velocidadProcesador;
    }
    
}
