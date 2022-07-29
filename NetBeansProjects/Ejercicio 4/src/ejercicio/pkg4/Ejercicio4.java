/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tempC, tempF;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius");
        tempC = leer.nextDouble();
        tempF = 32 + (9* tempC/5);
        System.out.println("La temperatura es: "+tempF+"ºF" );
    }
    
}
