package condicional_tarea;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
        double num_1 = teclado.nextDouble();
        double num_2 = teclado.nextDouble();
        if (num_1 > num_2) {
            System.out.println("El primer número es mayor");
        }else if (num_1 == num_2) {
            System.out.println("No válido");
        } else
            System.out.println("El primer número es menor");
    }
}