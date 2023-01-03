package bimestre2.semana1.semana4;

public class SumaMatriz {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{1,6,5}};
        int b[][] = {{0,1,3},{9,3,1},{1,9,5}};
        int filas =a.length;
        int cols = a[0].length;
        int c[][] = new int[filas][cols];
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                c[fila][col]=a[fila][col]+b[fila][col];
            }
        }
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(a[fila][col]+" + "+b[fila][col]+" = "+c[fila][col]+"\t");
            }
            System.out.print("\n");
        }
    }
}
