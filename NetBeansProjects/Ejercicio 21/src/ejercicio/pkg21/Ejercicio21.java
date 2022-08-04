/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg21;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] M = new int [5][5];
        int[][] P = new int [3][3];
        LlenarMatriz(M,leer,5);
        System.out.println("----------------");
        LlenarMatriz(P,leer,3);
        System.out.println("----------------");
        MostrarMatriz(M,5);
        System.out.println("----------------");
        MostrarMatriz(P,3);
        System.out.println("----------------");
        PContenidaEnM(M,P,5,3);
    }
    public static void LlenarMatriz (int [][] X, Scanner leer, int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.println("Ingrese el elemento ["+i+"]"+"["+j+"]"+" de la matriz");
                X[i][j] = leer.nextInt();
            }
        }
    }
    public static void MostrarMatriz (int [][] M, int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print("["+ M[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    public static void PContenidaEnM (int[][] M, int[][] P, int n, int m)
    {
        boolean b = false;
        int i;
        int j = 0;
        int cont = 0;
        for (i = 0; i < n-m+1; i++) 
        {
            for (j = 0; j < n-m+1; j++) 
            {
                if (P[0][0] == M[i][j]) 
                {
                    b = CompararElementos(M,P,i,j);
                    if (b) {
                        break;
                    }
                }
            }
            if (b) {
                break;
            }
        }
        if (b)
        {
            System.out.println("La matriz P se encuentra en las coordenadas: ");
            for (int k = i; k < i+3; k++) 
            {
                for (int l = j; l < j+3; l++) 
                {
                    System.out.print("["+k+"]"+"["+l+"] - ");
                }  
                System.out.println("");
            }
        }else System.out.println("La matriz P no se encuentra en la matriz M");
        
        
    }
    public static boolean CompararElementos(int[][] M, int[][] P, int n, int m)
    {
        boolean b = true;
        int k=0;
        int l;
        for (int i = n; i < n+3; i++) 
        {
            l=0;
            for (int j = m; j < m+3; j++) 
            {
                if (P[k][l] == M[i][j]) 
                {
                    b = true;
                }else 
                {
                    return false;
                }
                l++;
            }
            k++;
        }
        return b;
    }
}
