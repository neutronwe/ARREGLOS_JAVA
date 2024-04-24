
package com.mycompany.arreglos;


public class Matrices {


    public static void main(String[] args) {
        
        //Declaración              F  C
        int matriz [][] = new int [3][3];
        
        //Asignación manual
        matriz [0][0] = 27;
        matriz [0][1] = 34;
        matriz [0][2] = 7;
        matriz [1][0] = 5;
        matriz [1][1] = 25;
        matriz [1][2] = 85;
        matriz [2][0] = 78;
        matriz [2][1] = 69;
        matriz [2][2] = 55;
        
        System.out.println("\n                        F   C\n");
        
        //Recorrido
        for (int fila = 0; fila < 3; fila++){
            
            for (int columna = 0; columna < 3; columna++){
                
                System.out.println("El valor de la posicion " + fila + " | " + columna);
                System.out.println("Es de: " + matriz[fila][columna]);
                System.out.println("-----------------");
            }
        }
    }  
}
