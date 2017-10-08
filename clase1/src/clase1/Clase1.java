/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;
import java.util.Scanner;
/**
 *
 * @author jahur
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tabla de multiplicar
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tabla de Multiplicar (1-12)");
        System.out.print("Ingrese el valor a utilizar: ");
        int num = input.nextInt();
        
        for (int i = 0; i < 12; i++) {
            System.out.print(num+" * "+(i+1)+" = "+((i+1)*num)+"\n");
        }

    }
    
}
