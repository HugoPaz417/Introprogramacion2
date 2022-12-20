package bimestre2.semana1.semana2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine().toLowerCase();
        int tam_palabra = palabra.length();
        System.out.println("tamaño de la palabra " + tam_palabra);
        char palabra_arr[] = new char[tam_palabra];
        for (int indice = 0; indice < tam_palabra; indice++) {
            palabra_arr[indice] = palabra.charAt(indice);
        }
        for (int indice = 0; indice < tam_palabra; indice++) {
            System.out.println(palabra_arr[indice]);
        }
        // lectura del arreglo de derecha a izquierda
        String palabra_invertida = "";
        for (int indice = tam_palabra - 1; indice >= 0; indice--) {
            palabra_invertida = palabra_invertida + palabra_arr[indice];
        }
        //determinamos si es palindromo o no
        if (palabra.equals(palabra_invertida)) {
            System.out.println("Si es palabra palíndroma");
        } else {
            System.out.println("No es palabra palíndroma");
        }
    }
}