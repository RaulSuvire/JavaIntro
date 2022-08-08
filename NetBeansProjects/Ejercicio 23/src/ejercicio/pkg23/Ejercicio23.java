/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg23;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [][] M = new String [20][20];
        String palabra;
        int i = 0;
        inicializarMatriz(M);
        while (i < 5) 
        {
            System.out.println("Ingrese una palabra de 3 a 5 caracteres");
            palabra = leer.next();
            if (palabra.length()>= 3 && palabra.length()<=5) 
            {
                colocarPalabra(M,palabra);
                i++;
            } else 
            {
                System.out.println("La palabra ingresada no es válida");
            }
            System.out.println("--------------------");
        }
        rellenarMatriz(M);
        mostrarMatriz(M);
    }          
    public static void inicializarMatriz (String [][] M)
    {
        for (int i = 0; i < 19; i++) 
        {
            for (int j = 0; j < 19; j++) 
            {
                M[i][j] = " ";
            }
        }
    }
    public static void colocarPalabra(String [][] M, String palabra)
    {
        Random r = new Random();
        int f = r.nextInt(19);
        int c = r.nextInt(14);
        for (int i = 0; i < palabra.length(); i++) {
            M[f][c+i] = palabra.substring(i,i+1);
        }
    }
    public static void rellenarMatriz(String [][] M)
    {
        for (int i = 0; i < 19; i++) 
        {
            for (int j = 0; j < 19; j++) 
            {
                if (M[i][j].equals(" ")) {
                    M[i][j] = Integer.toString((int)(Math.random()*10));
                }
            }
        }
    }
    public static void mostrarMatriz(String [][] M)
    {
        for (int i = 0; i < 19; i++) 
        {
            for (int j = 0; j < 19; j++) 
            {
                System.out.print(M[i][j]);
            }
            System.out.println("");
        }
    }
}
