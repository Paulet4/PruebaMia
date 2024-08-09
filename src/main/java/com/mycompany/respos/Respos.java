/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.respos;

/**
 *
 * @author pato4
 */
public class Respos {

    public static void main(String[] args) {
        System.out.println("Probando.............!");
        System.out.println("Multiplicación de Matrices ");

        // Código de multiplicación de matrices
        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{5, 6}, {7, 8}};
        int[][] resultado = multiplicarMatrices(matriz1, matriz2);

        // Mostrar el resultado
        System.out.println("Resultado de la multiplicación de matrices:");
        imprimirMatriz(resultado);
    }

    // Método para multiplicar matrices
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
       
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int columnas2 = matriz2[0].length;
        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
      
}
