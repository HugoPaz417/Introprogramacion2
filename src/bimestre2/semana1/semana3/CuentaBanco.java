package bimestre2.semana1.semana3;

import java.util.Scanner;

public class CuentaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String socios[] = {"David", "Maria", "Jose", "Cristian", "Richard" };
        int cuenta[] = {123, 321, 982, 567, 746};
        int saldo[] = {1200, 5000, 3000, 2500, 10000};
        System.out.println("Ingrese el numero de cuenta");
        int n_cuenta = sc.nextInt();
        for (int indice = 0; indice < cuenta.length; indice++) {
            for (int interruptor = 0; interruptor <1 ; interruptor++) {
            if (n_cuenta == cuenta[indice]) {
                System.out.println("Desea hacer: ");
                System.out.println("1. Deposito");
                System.out.println("2. Retiro");
                System.out.println("3. Consulta de saldo");
                System.out.println("4. Salir");
                int x = sc.nextInt();
                if (x==1) {
                    System.out.println("¿Cuanto dinero desea ingresar?");
                    int dinero_ingresar = sc.nextInt();
                    if (dinero_ingresar > 1) {
                        System.out.println("Numero negativo");
                    } else{
                        saldo[indice] = saldo[indice] + dinero_ingresar;
                    interruptor--;
                    }
                }
                if (x==2) {
                    System.out.println("¿Cuánto dinero desea retirar?");
                    int dinero_retirar = sc.nextInt();
                    if (dinero_retirar>saldo[indice]) {
                        System.out.println("Saldos insuficientes");
                    } else {
                        saldo[indice] = saldo[indice] - dinero_retirar;
                        interruptor--;
                    }
                }
                if (x==3) {
                    System.out.println("El dinero de su cuenta es: " + saldo[indice]);
                    interruptor--;
                }
                if (x==4) {
                    System.out.println("Fin");
                    break;
                }
                }
            }
        }
    }
}