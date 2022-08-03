/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] M = new int [4][4];
        //LlenarM(M);
        M[0][0]= 0;
        M[0][1]= -2;
        M[0][2]= 4;
        M[1][0]= 2;
        M[1][1]= 0;
        M[1][2]= 2;
        M[2][0]= 4;
        M[2][1]= -2;
        M[2][2]= 0;
        MostrarM(M);
        TranspuestaM(M);
        AntisimetricaM(M);
    }
    
    public static void LlenarM (int [][] M)
    {
        Random r = new Random();
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                M[i][j] = r.nextInt(9);
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
    public static void TranspuestaM (int[][] M)
    {
        int[][] B = new int [4][4]; 
        System.out.println("Matriz Transpuesta: ");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                B[i][j] = M[j][i];
            }
        }
        MostrarM(B);
    }
    public static void AntisimetricaM (int[][] M)
    {
        boolean b;
        b = false;
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (i == j && M[i][j] == 0) 
                {
                    b = true;
                }else {
                    if (i <= j && -M[i][j] == M[j][i]) 
                    {
                        b = true;
                    } else {
                        if (i > j) {
                            continue;
                        } else {
                        b = false;
                        break;
                        }
                    }
                }
            }
            if (b == false) {
                break;
            }
        }
        if (b) {
            System.out.println("La matriz es anti simétrica");
        } else System.out.println("La matriz no es anti simétrica");
    }
}
