package bimestre2.semana1.semana6;

import java.util.Scanner;

public class Cajero {
    int saldo;

    public int retirar(int saldo_retiro) {
        saldo -= saldo_retiro;
        return saldo;
    }

    public int depositar(int saldo_deposito) {
        saldo += saldo_deposito;
        return saldo;
    }
    public void consultar(int saldo){
        saldo-=1;
    }
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su saldo");
        saldo=sc.nextInt();
        System.out.println(saldo);
        boolean interruptor = true;
        while (interruptor) {
            System.out.println();
            System.out.println("Digite 1 para hacer un retirowo");
            System.out.println("Digite 2 para hacer un depositowo");
            System.out.println("Digite 3 para hacer consulta  de saldowo");
            System.out.println("Digite 0 para salir iwi");
            System.out.println();
            int opcion = sc.nextInt();
            if (opcion == 0)
                interruptor=false;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a retirar");
                    retirar(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar");
                    depositar(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Su saldo es: ");
                    consultar(saldo);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Cajero mivariable = new Cajero();
        mivariable.ejecutar();
    }
}