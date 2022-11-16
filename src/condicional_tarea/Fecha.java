package condicional_tarea;

import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        System.out.println("programa para determinar una fecha");
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa una fecha");
        System.out.println("Ingresa el año");
        int year = teclado.nextInt();
        System.out.println("Ingresa el mes");
        int mes = teclado.nextInt();
        System.out.println("Ingresa el día");
        int dia = teclado.nextInt();
        if (year >= 1990 && year <= 2010) {
            if (mes == 1)
                if (dia >= 1 && dia <= 31)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 2)
                if (dia >= 1 && dia <= 28)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 3)
                if (dia >= 1 && dia <= 31)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 4)
                if (dia >= 1 && dia <= 30)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 5)
                if (dia >= 1 && dia <= 31)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 6)
                if (dia >= 1 && dia <= 30)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 7)
                if (dia >= 1 && dia <= 31)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 8)
                if (dia >= 1 && dia <= 31)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 9)
                if (dia >= 1 && dia <= 30)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 10)
                if (dia >= 1 && dia <= 31)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 11)
                if (dia >= 1 && dia <= 30)
                    System.out.println("La fecha ingresada es correcta");
            if (mes == 12)
                if (dia >= 1 && dia <= 31)
                    System.out.println("La fecha ingresada es correcta");
                else
                    System.out.println("La fecha ingresada es incorrecta");
        }
    }
}