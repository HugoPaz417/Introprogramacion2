package bimestre2.semana1.semana4;

public class Matriz {
    public static void main(String[] args) {
        int matriz[][] = new int[2][3];
        //creación de una matriz con valores predefinidos
        String univ[][] = {
                {"utpl", "ucuenca", "espol"},
                {"unl", "uzuay", "uide"}
        };
        int filas = univ.length;
        int columnas =univ[1].length;
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println(univ[fila][col]+"\t");
            }
            System.out.println("\n");
        }
    }
}