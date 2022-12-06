package bimestre2;

import java.util.Scanner;

public class NumeroAbundante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador, suma_divisores, n;
        System.out.println("Ingrese un numero");
        n = sc.nextInt();
        contador = 1;
        suma_divisores=0;
        while (contador<n){
            if (n%contador==0)
                suma_divisores=suma_divisores+contador;
            contador++;
        }
        if (suma_divisores>n)
            System.out.println(n+" es número abundante");
        else {
            System.out.println(n+" no es número abundante");
        }
    }
}