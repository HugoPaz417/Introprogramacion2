package bimestre2.semana1.semana2;

import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_binario []= new int[6];
        int suma = 0;
        System.out.println("Ingrese un número binario de hasta 6 cifras");
        for (int indice = 0; indice < n_binario.length; indice++) {
            int n = sc.nextInt();
            if (n<0 || n>1) {
                System.out.println("Error, no es un numero binario");
                break;
            }
            n_binario [indice] = n;
            for (int exponente = 0; exponente < indice; exponente++) {
                suma = suma+(n*(2*exponente));
            }
            System.out.println(suma);
        }
    }
}