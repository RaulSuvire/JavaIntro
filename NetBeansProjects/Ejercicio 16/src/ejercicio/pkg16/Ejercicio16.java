/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam, num ;
        int [] V;
        System.out.println("Ingrese el tamaño del vector");
        tam = leer.nextInt();
        V = new int [tam];
        LlenarV(V,tam);
        MostrarV(V,tam);
        System.out.println("Ingrese el número que desea buscar");
        num = leer.nextInt();
        BuscarEnV(V,tam,num);
        
    }
     public static void LlenarV (int [] vec, int n)
    {
        for (int i = 0; i < n; i++) {
            vec[i] = (int) Math.floor(Math.random()*10+1);
        }
    }
     public static void MostrarV (int [] vec, int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.println(vec[i]);
        }
    }
     public static void BuscarEnV (int [] vec , int n, int num)
     {
         for (int i = 0; i < n; i++) {
             if (vec[i] == num)
             {
                 System.out.println("El número se encuentra en la posición " + i);
             }
         }
     }
}
