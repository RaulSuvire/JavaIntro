/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int[][] M = new int [3][3];
        LlenarM(M, leer);
        MostrarM(M);
        CalcularMagico(M);
    }
    public static void LlenarM (int [][] M, Scanner leer)
    {
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.println("Ingrese el elemento ["+i+"]"+"["+j+"]"+" de la matriz");
                M[i][j] = leer.nextInt();
            }
        }
    }
    public static void MostrarM (int [][] M)
    {
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("["+ M[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    public static void CalcularMagico (int [][] M)
    {
        boolean b = true;
        int auxf = 0;
        int auxc = 0;
        int auxd = 0;
        int total = M[0][0] + M[1][1] + M[2][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                auxf += M[i][j];
                auxc += M[j][i];
                if (j == 2-i) {
                    auxd += M[i][j];
                }
            }
            if (total != auxf){
                b = false;
                break;
            }
            if (total != auxc) {
                b = false;
                break;
            }
            auxf = 0;
            auxc = 0;                    
        }
        if (total != auxd && b) {
            b = false;
        }
        if (b) {
            System.out.println("La matriz es mágica");
        } else System.out.println("La matriz no es mágica");
    }
}
