package estructura_for;

import java.util.Scanner;

public class TablaAsterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas");
        int columnas = sc.nextInt();
        for (int fila = 1; fila <= filas; fila++) {//Controlamos número de filas
            String fila_asteriscos = "";
            for (int col = 1; col <= columnas; col++) {//Número de columnas
                fila_asteriscos=fila_asteriscos+"*";
                }
            System.out.println(fila_asteriscos);
        }
    }
}