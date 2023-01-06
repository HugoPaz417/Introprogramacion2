package bimestre2.semana1.semana4;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        char letras [][] = {{'a','b','c'},{'d','e','f'}};
        char transpuesta [][] = new char[letras[0].length][letras.length];
        for (int fila  = 0; fila  < letras[0].length; fila ++) {
            for (int col = 0; col < letras.length ; col++) {
                transpuesta[fila][col]=letras[col][fila];
                System.out.print(transpuesta[fila][col]+"\t");
            }
            System.out.println();
        }
    }
}
