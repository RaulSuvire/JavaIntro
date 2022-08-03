/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros;
        String moneda;
        
        System.out.println("Ingrese la cantidad de euros: ");
        euros = leer.nextDouble();
        System.out.println("Ingrese la moneda a la que desea cambiar. (dolar, yen, libra)");
        moneda = leer.next();
        convertir(euros,moneda);
    }
    
    public static void convertir (double euro, String moneda ){
        if(moneda.equals("dolar"))
        {
            System.out.println("U$D "+ (euro * 1.28611));            
        }else
        {
            if (moneda.equals("yen"))
            {
                System.out.println("¥ "+ (euro * 129.852));
            } else 
            {
                if (moneda.equals("libra"))
                {
                    System.out.println("₤ " + (euro * 0.86));
                } else System.out.println("La moneda no es válida");
            }
        }
    }
    
}
