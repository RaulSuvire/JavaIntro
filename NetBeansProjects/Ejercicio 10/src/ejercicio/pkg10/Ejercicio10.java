/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int limite, suma, num;
        System.out.println("Ingrese el límite");
       limite = leer.nextInt();
       suma = 0;
       while (suma < limite)
       {
           System.out.println("Ingrese un número");
           num = leer.nextInt();
           suma += num;
       }
        System.out.println("La suma total es: "+ suma);
    }
    
}
