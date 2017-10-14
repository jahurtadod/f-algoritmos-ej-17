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
public class EjemploClases3 {
    public static void main(String[] args) {
        
        Computadora laptop = new Computadora();
        
        laptop.setVelocidadProcesaror(2.3);
        
        System.out.println(laptop.getVelocidadProcesador());
        
        laptop.setVelocidadProcesaror(10.3);
        
        System.out.println(laptop.getVelocidadProcesador());
        
        System.out.println(laptop.toString());
        
    }
}
