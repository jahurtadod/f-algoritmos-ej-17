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
public class EjemploClases2 {
    
    public static void main(String[] args) {
        
        Computadora laptop = new Computadora();
        
        laptop.setVelocidadProcesador(2.3);
        
        System.out.println(laptop.getVelocidadProcesador());
        
        laptop.setVelocidadProcesador(10.3);
        
        System.out.println(laptop.getVelocidadProcesador());
        
    }
}
