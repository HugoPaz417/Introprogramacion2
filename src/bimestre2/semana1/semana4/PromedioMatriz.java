package bimestre2.semana1.semana4;

/**
 * Programa para calcular el promedio de los elementos de una matriz dada
 */

public class PromedioMatriz {
    public static void main(String[] args) {
        int numeros [][] = {{5,6},{2,7},{7,1},{3,4}};
        double suma_total = 0;
        int filas = numeros.length;
        int cols = numeros[0].length;
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                suma_total=suma_total+numeros[fila][col];
            }
        }
        double prom = suma_total/(numeros.length*numeros[0].length);
        System.out.println("Suma = "+suma_total);
        System.out.println("Promeido = "+prom);
    }
}
