package condicional_tarea;

import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        double tiempo = teclado.nextDouble();
        double minutos_dias = tiempo/1440;
        System.out.println(tiempo+ " en días es igual a "+ minutos_dias);
        double minutos_horas = tiempo/60;
        System.out.println(tiempo+ " en horas es igual a "+ minutos_horas);
        double minutos_segundos = tiempo*60;
        System.out.println(tiempo+ " en segundos es igual a "+ minutos_segundos);
    }
}