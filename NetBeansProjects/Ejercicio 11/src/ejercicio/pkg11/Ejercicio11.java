/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1, num2, op;
        String sn;
        sn = "n";
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número, Distinto de cero");
        num2 = leer.nextInt();
        do{
            System.out.println("---------------------------");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción: ");
            
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("La suma es: "+ (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: "+ (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: "+ (num1*num2));
                    break;
                case 4:
                    System.out.println("La división es: "+ (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    sn = leer.next();
                    if (sn.substring(0,1).equals("s")) {
                        break;
                    }else 
                    {
                        if(sn.compareTo("n")!=0)
                        {
                            System.out.println("La opcion no es válida");
                            sn = "n";
                            break;
                        }
                    }
            }
        }while (sn.substring(0,1).equals("n"));
    }
    
}
