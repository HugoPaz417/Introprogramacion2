package estructura_for;

import java.util.Scanner;

public class TablaMultiplicacion {
    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        boolean interruptor = true;
        for (int contador = 10; (contador >= 0 && interruptor); contador--) {
            int mult = num*contador;
            System.out.println(num+" * "+contador+" = "+mult);
            if (contador==5)
                interruptor=false;
        }
    }
}
