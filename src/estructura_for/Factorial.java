package estructura_for;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        int factorial = 1;
        for (int contador = 1; contador<= num; contador++) {
            factorial = factorial*contador;
        }
        System.out.println("EL factorial de "+num+" es "+factorial);
    }
}