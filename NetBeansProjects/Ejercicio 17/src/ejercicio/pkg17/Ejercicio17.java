/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int[] V;
        System.out.println("Ingrese el tamaño del vector");
        num = leer.nextInt();
        V = new int [num];
        LlenarV(V,num);
        MostrarV(V,num);
        CantidadDigitos(V,num);
    }
    public static void LlenarV (int [] vec, int n)
    {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            vec[i] = r.nextInt(20000);
        }
    }
     public static void MostrarV (int [] vec, int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vec[i]);
        }
    }
    public static void CantidadDigitos(int[] vec, int n)
    {
        int dig1, dig2, dig3, dig4, dig5; 
        dig1 = 0; 
        dig2 = 0; 
        dig3 = 0; 
        dig4 = 0; 
        dig5 = 0;
        for (int i = 0; i < n; i++) 
        {
            if (vec[i] >= 0 && vec[i] <= 9) 
            {
                dig1++;
            } else 
            {
                if (vec[i] >= 10 && vec[i] <= 99) 
                {
                    dig2++;
                }else 
                {
                    if (vec[i] >= 100 && vec[i] <= 999) 
                    {
                        dig3++;
                    } else 
                    {
                        if (vec[i] >= 1000 && vec[i] <= 9999) 
                        {
                            dig4++;
                        } else dig5++;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("La cantidad de números de un dígito es: "+dig1);
        System.out.println("La cantidad de números de dos dígito es: "+dig2);
        System.out.println("La cantidad de números de tres dígito es: "+dig3);
        System.out.println("La cantidad de números de cuatro dígito es: "+dig4);
        System.out.println("La cantidad de números de cinco dígito es: "+dig5);
    }
}
