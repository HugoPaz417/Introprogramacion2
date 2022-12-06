package bimestre2;

import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int interruptor = 0;
        while (interruptor == 0) {
            System.out.println("Ingrese opcion del 1 al 4: ");
            System.out.println("Op 1: convertir un valor de MB a KB");
            System.out.println("Op 2: convertir un valor de KB a MB");
            System.out.println("Op 3: convertir un valor de MB a bits");
            System.out.println("Op 4: Salir");
            int opcion = sc.nextInt();
            if (opcion < 1 || opcion > 4) {
                System.out.println();
                System.out.println("Error intente de nuevowo");
                System.out.println();
            }
            else {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese valor en MB para convertir a KB");
                        double valor_MB = sc.nextDouble();
                        double valor_MBaKB = valor_MB * 1024;
                        System.out.println(valor_MB+" en KB "+valor_MBaKB);
                    }
                    case 2 -> {
                        System.out.println("Ingrese valor en KB para convertir a MB");
                        double valor_KB = sc.nextDouble();
                        double valor_KBaMB = valor_KB / 1024;
                        System.out.println(valor_KB+" en MB "+valor_KBaMB);
                    }
                    case 3 -> {
                        System.out.println("Ingrese valor en MB para convertir a bits");
                        double valor_bits = sc.nextDouble();
                        double valor_MBabits = valor_bits * 8000000;
                        System.out.println(valor_bits+" a bits "+valor_MBabits);
                    }
                    case 4 -> interruptor = 1;
                }
            }
        }
    }
}