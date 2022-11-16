package condicional_tarea;

import java.util.Scanner;

public class ToleranciaComponente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tolerancia;
        System.out.println("Ingrese tolerancia");
        tolerancia = teclado.nextDouble();
        if (tolerancia <= 100 && tolerancia > 0)
            if (tolerancia >= 0 && tolerancia < 0.1) {
                System.out.println("Exploración espacial");
            } else if (tolerancia >= 0.1 && tolerancia < 1) {
                System.out.println("Grado militar");
            } else if (tolerancia >= 1 && tolerancia < 10) {
                System.out.println("Grado comercial");
            } else if (tolerancia > 10 && tolerancia <= 100) {
                System.out.println("Grado de juguete");
            } else
                System.out.println("No valido");
    }
}