package bimestre2.semana1.semana2;

import java.util.Scanner;

public class VerificarCedula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador1 = 0;
        int acumulador2 = 0;
        int suma_total = 0;
        int multiplicacion = 0;
        int x = 0;
        int resta = 0;
        int cedula[] = new int[10];
        int numero_arr[] = new int[cedula.length];
        for (int indice = 0; indice < cedula.length; indice++) {
            System.out.println("Ingrese el numero " + (indice + 1) + " de su numero de cedula");
            int numero = sc.nextInt();
            numero_arr[indice] = numero;
        }
        for (int indice = 0; indice < cedula.length; indice = indice + 2) {
            multiplicacion = numero_arr[indice] * 2;
            if (multiplicacion >= 10)
                multiplicacion = multiplicacion - 9;
            acumulador1 = acumulador1 + multiplicacion;
        }
        for (int indice = 1; indice < cedula.length - 1; indice = indice + 2) {
            acumulador2 = numero_arr[indice] + acumulador2;
        }
        suma_total = acumulador1 + acumulador2;
        if (suma_total > 0 && suma_total < 10)
            x = 10;
        if (suma_total > 10 && suma_total < 20)
            x = 20;
        if (suma_total > 20 && suma_total < 30)
            x = 30;
        if (suma_total > 30 && suma_total < 40)
            x = 40;
        if (suma_total > 40 && suma_total < 50)
            x = 50;
        if (suma_total > 50 && suma_total < 60)
            x = 60;
        if (suma_total > 60 && suma_total < 70)
            x = 70;
        resta = x - suma_total;
        System.out.println(resta);
        for (int i = 9; i < 10; i++) {
            if (resta == numero_arr[i]) {
                System.out.println("Es una cedula valida");
            } else {
                System.out.println("No es una cedula valida");
            }
        }
    }
}