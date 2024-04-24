
package com.mycompany.arreglos;

import java.util.Scanner;


public class matricesIngresoDatos {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int cantFilas = 3;
        int cantColumnas = 3;
        
        //Declaración                  F           C
        int matriz [][] = new int [cantFilas][cantColumnas];
        
        System.out.println("\n                                F   C\n");
        
        //Asignación por el usuario
        for (int fila = 0; fila < cantFilas; fila++){
            
            for (int columna = 0; columna < cantColumnas; columna++){
                
                System.out.println("Ingrese el valor de la posicion " + fila + " | " + columna);
                matriz[fila][columna] = teclado.nextInt();
            }
        }
        
        System.out.println("\n                        F   C\n");
        
        //Recorrido
        for (int fila = 0; fila < cantFilas; fila++){
            
            for (int columna = 0; columna < cantColumnas; columna++){
                
                System.out.println("El valor de la posicion " + fila + " | " + columna);
                System.out.println("Es de: " + matriz[fila][columna]);
                System.out.println("-----------------");
            }
        }
    }  
}
