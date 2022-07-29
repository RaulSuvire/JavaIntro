/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        System.out.println("Doble: "+ num*2);
        System.out.println("Triple: "+ num*3);
        System.out.println("Raíz: " + Math.sqrt(num));
    }
    
}
