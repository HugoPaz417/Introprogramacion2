package bimestre2.semana1.semana2;

import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_binario []= new int[6];
        double suma = 0;
        double n_multiplacion = 2;
        double acumulador= 0;
        System.out.println("Ingrese un número binario de hasta 6 cifras");
        for (int indice = 0; indice < n_binario.length; indice++) {
            System.out.println("Ingrese la cifra "+(indice+1));
            int n = sc.nextInt();
            if (n<0 || n>1) {
                System.out.println("Error, no es un numero binario");
                break;
            }
            n_binario [indice] = n;
            for (int x = n_binario.length, exponente = 0; x > indice; x--, exponente++) {
                suma =(n_binario[indice])*(Math.pow(n_multiplacion,exponente));
            }
            acumulador = acumulador+suma;
        }
        System.out.println(acumulador);
    }
}