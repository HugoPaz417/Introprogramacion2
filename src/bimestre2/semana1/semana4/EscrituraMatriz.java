package bimestre2.semana1.semana4;

import java.util.Scanner;

public class EscrituraMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[][] = new int[3][2];
        int filas = numeros.length;
        int columnas = numeros[1].length;
        //operacion escritura de una matriz
        System.out.println();
        System.out.println("Holawa :D");
        System.out.println();
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Ingrese la edad de la fila "+(fila+1)+" columna "+(col+1));
                numeros[fila][col] = sc.nextInt();
            }
        }
        //operacion lectura de una matriz
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print(numeros[fila][col]+"\t");
            }
            System.out.print("\n");
        }
    }
}