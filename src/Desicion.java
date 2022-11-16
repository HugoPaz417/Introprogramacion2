import java.util.Scanner;

/**
 * Programa para determinar si una persona es mayor o menor de edad
 */
public class Desicion {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA DETERMINAR SI UNA PERSONA ES MAYOR DE EDAD");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
            System.out.println("te falta madurar");
        }
    }
}