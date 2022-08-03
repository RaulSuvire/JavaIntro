/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg18;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] M = new int [4][4];
        LlenarM(M);
        MostrarM(M);
        TranspuestaM(M);
    }
    public static void LlenarM (int [][] M)
    {
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M[i][j] = r.nextInt(9);
            }
        }
    }
     public static void MostrarM (int [][] M)
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ M[i][j]+"] ");
            }
            System.out.println("");
        }
    }
     public static void TranspuestaM (int[][] M)
     {
         int[][] B = new int [4][4]; 
         System.out.println("Matriz Transpuesta: ");
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 B[i][j] = M[j][i];
             }
         }
         MostrarM(B);
     }
}
