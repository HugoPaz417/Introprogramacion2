package bimestre2.semana1.semana4;

import java.util.Scanner;

/**
 * Programa para elevar a ua potencia dada los elementos de la matriz
 */

public class MatrizPontencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //dimension de la matriz 3x3
        int mat_potencia[][] = new int[numeros.length][numeros[0].length];
        System.out.println("Ingrese el valor de la  potencia");
        int potencia = sc.nextInt();
        int filas = numeros.length;
        int cols = numeros[0].length;
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                mat_potencia[fila][col]= (int)Math.pow(numeros[fila][col],potencia);
                System.out.print(mat_potencia[fila][col]+"\t");
            }
            System.out.print("\n");
        }
    }
}