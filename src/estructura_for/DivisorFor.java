package estructura_for;

import java.util.Scanner;

public class DivisorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingerse un número");
        int num = sc.nextInt();
        for (int contador = 1; contador<=num; contador++) {
            if (num%contador==0)
                System.out.println("los divisores de "+num+" son "+contador);
        }
    }
}