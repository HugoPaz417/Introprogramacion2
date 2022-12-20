package bimestre2.semana1.semana3;

import java.util.Scanner;

public class FichaDato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int interruptor = 1;
        String nombres [] = new String[3];
        int edad [] = new int [3];
        String universidad [] = new String[3];
        for (int indice = 0; indice < interruptor; indice++) {
            System.out.println("Ingrese el nombre del estudiante");
            nombres[indice]=sc.nextLine();
            sc.nextLine();
            System.out.println("Ingrese la edad");
            edad[indice] =sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la universidad");
            universidad[indice]=sc.nextLine();
            sc.nextLine();
            System.out.println("Desea ingresar otro estudiante? 1=Si, 0=No");
            int a = sc.nextInt();
            if (a == 1) {
                interruptor++;
            }
        }
        for (int indice = 0; indice < nombres.length; indice++) {
            System.out.println(nombres[indice]);
            System.out.println(edad[indice]);
            System.out.println(universidad[indice]);
        }
    }
}
