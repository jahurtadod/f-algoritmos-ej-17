/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclases3;

/**
 *
 * @author jahur
 */
public class Computadora {
    
    private double velocidadProcesador;
    
    public void setVelocidadProcesaror(double velocidadProcesador) {
        
        if (velocidadProcesador > 5) {
            this.velocidadProcesador = 5.0;
        }else {
            this.velocidadProcesador = velocidadProcesador;
        }
    }
    
    public double getVelocidadProcesador() {
        return this.velocidadProcesador;
    }
    
    @Override
    public String toString() {
        
        String response = String.format("Computadora con\n" + "velocidad %f", this.velocidadProcesador);
        
        return response;        
    }
}
