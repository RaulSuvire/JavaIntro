/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad;
        cad = "";
        int cont_c, cont_i;
        cont_c = 0;
        cont_i = 0;
        while (cad.compareTo("&&&&&") != 0)
        {
            System.out.println("Ingrese la cadena: ");
            cad = leer.nextLine();
            cad = cad.toUpperCase();
            if(cad.compareTo("&&&&&") == 0 )
            {
                break;
            }else 
            {
                if(cad.length() != 5)
                {
                    cont_i++;
                }else 
                {
                    if(cad.substring(0, 1).equals("X") && cad.substring(4, 5).equals("O"))
                    {
                        cont_c++;
                    }else cont_i++;
                    
                }
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("La cantidad de cadenas correctas es: "+cont_c);
        System.out.println("La cantidad de cadenas incorrectas es: "+cont_i);
    }
    
}
