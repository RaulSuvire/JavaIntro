/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número: ");
        num = leer.nextInt();
        ParImpar(num);
    }
    
    public static void ParImpar(int num){
        if (num % 2 == 0) {
            System.out.println("El número es PAR");
        }else {
            System.out.println("El número es IMPAR");
        }
    }
    
}
