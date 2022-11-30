package ejercicio_final;

import java.util.Scanner;

public class tabla {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese cantidad de numeros para generar");
        int numeros_generar = teclado.nextInt();
            int n_1 = 0;
            int n_2 = 1;
            int n;
            for (int f = 1; f <= numeros_generar+1; f++) {
                n=n_1;
                n_1=n_2 + n_1;
                n_2=n;
                System.out.println(n_2);
                {
                    String fila_asteriscos = "";
                    for (int col = 1; col <= n; col++) {//Número de columnas
                        fila_asteriscos = fila_asteriscos + "*";
                    }
                    System.out.println(fila_asteriscos);
                }
            }
    }
}