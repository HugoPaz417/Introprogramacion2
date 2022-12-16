package bimestre2.semana1.semana2;

import java.util.Scanner;

public class SumaNumero {
    public static void main(String[] args) {
        int numeros1 [];
        int numeros2 [];
        int suma [];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que va a ingresar");
        int n = sc.nextInt();
        sc.nextLine();
        numeros1 = new int[n];
        numeros2 = new int[n];
        suma = new int[n];
        for (int indice = 0; indice < n; indice++) {
            System.out.println("Ingrese numero del primer arreglo, "+(indice+1));
            int numero_1 = sc.nextInt();
            numeros1[indice]=numero_1;
        }
        for (int indice = 0; indice < n; indice++) {
            System.out.println("Ingrese numero del segundo arreglo, " + (indice + 1));
            int numero_2 = sc.nextInt();
            numeros2[indice] = numero_2;
        }
        for (int indice = 0; indice < n; indice++) {
            suma[indice] = numeros1[indice]+numeros2[indice];
        }
        for (int indice = 0; indice < n; indice++) {
            System.out.println(numeros1[indice]+" + "+numeros2[indice]);
            System.out.println(suma[indice]);

        }
    }
}