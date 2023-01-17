package bimestre2.semana1.semana6;

import java.util.Scanner;

/**
 * Programa para crear métodos para realizar operaciones matemáticas
 */
public class OperacionAritmetica {
    int n1, n2; //Creación de variables globales
    /**
     * Método para realizar la suma de 2 números enterowos
     * @param n1
     * @param n2
     * @return
     */
    public int sumar(int n1, int n2){
        return (n1+n2);
    }
    /**
     * Método para realizar la resta de 2 números enterowos
     * @param n1
     * @param n2
     * @return
     */
    public int restar(int n1, int n2){
        return (n1-n2);
    }
    /**
     * Método para multiplicar 2 números enterowos
     * @param n1
     * @param n2
     */
    public void multiplicar(int n1, int n2){
        System.out.println("La múltiplicación es: "+(n1*n2));
    }
    /**
     * Método para dividir 2 números enterowos
     */
    public void dividir(){
        if (n2>0) {
            System.out.println("La división es: " + ((double)n1 / (double)n2));
        }else{
            System.out.println("La división por 0 no existe");
        }
    }
    public void ejecutar(){
        Scanner sc = new Scanner(System.in);
        boolean interruptor = true;
        while (interruptor){
            System.out.println();
            System.out.println("Digite 1 para sumar 2 números");
            System.out.println("Digite 2 para restar 2 números");
            System.out.println("Digite 3 para multiplicar 2 números");
            System.out.println("Digite 4 para dividir 2 números");
            System.out.println("Digite 0 para salir");
            System.out.println();
            int opcion = sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Salir");
                    interruptor=false;
                    break;
                case 1:
                    ingresar_numeros();
                    System.out.println("La suma es "+sumar(n1,n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La suma es "+restar(n1,n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplicar(n1,n2);
                    break;
                case 4:
                    ingresar_numeros();
                    dividir();
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
    public void ingresar_numeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer númerowo");
        n1=sc.nextInt();
        System.out.println("Ingrese el segundo númerowo");
        n2=sc.nextInt();
    }
    public static void main(String[] args) {
        OperacionAritmetica mivariable = new OperacionAritmetica();
        mivariable.ejecutar();
    }
}