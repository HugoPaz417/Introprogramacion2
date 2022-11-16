package condicional_tarea;

import java.util.Scanner;

public class PresionLibras {
    public static void main(String[] args) {
        System.out.println("Programa para determinar el valor de la presion en libras");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tiempo");
        int tiempo = teclado.nextInt();

        if (tiempo <= 35 )
            System.out.println("La presion es: 0.46t");
        if (tiempo > 35 )
            System.out.println("La presion es: 9,64 psi");
    }
}