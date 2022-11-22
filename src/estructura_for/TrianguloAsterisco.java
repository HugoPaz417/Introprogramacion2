package estructura_for;

import java.util.Scanner;

public class TrianguloAsterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        for (int fila = 1; fila <= filas; fila++) {
            String fila_asteriscos = "";
            for (int col = 1; col == fila; col++) {
                fila_asteriscos=fila_asteriscos+"*";
            }
        }
    }
}