
package com.mycompany.arreglos;

import java.util.Scanner;


public class vectoresIngresoDatos {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        String vector [] = new String [3];
        
        for (int indice = 0; indice < vector.length; indice++){
            
            System.out.println("Ingrese el nombre de una fruta para el indice " + indice + ":");
            vector[indice] = teclado.next();
        }
        
        //para indice = 0 mientras sea menor al limite del vector (indice++) hacer
        for (int indice = 0; indice < vector.length; indice++){
            
            System.out.println("En el indice " + indice);
            System.out.println("Tengo guardado el nombre de fruta: " + vector[indice]);
            System.out.println("------------------");
        }
        
    }
    
}
