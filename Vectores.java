
package com.mycompany.arreglos;


public class Vectores {

    public static void main(String[] args) {
        
        //Declaración
        
        int vector [] = new int [4];
        
        //Asignación manual
        
        vector [0] = 1;
        vector [1] = 2;
        vector [2] = 3;
        vector [3] = 5;
        
        //Recorrido
        
        for (int i = 0; i<vector.length; i++){
            
            System.out.println("En el indice: " + i);
            System.out.println("Tengo guardado un: " + vector[i]);
            System.out.println("------------------");
        }
    }
}
