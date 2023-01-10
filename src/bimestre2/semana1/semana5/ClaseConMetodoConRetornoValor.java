package bimestre2.semana1.semana5;

import java.util.Scanner;

public class ClaseConMetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para sumar 2 numeros");
        System.out.println("Ingrese  el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        int resultado = sumar(num1,num2,5); //recibimos el valor
        //System.out.println("La suma es igual a "+resultado);
        //sumar_dos_numeros(num1,num2);
        //obtener el promedio de los numeros ingresados
        double promedio = obneter_promedio(resultado,3);
        System.out.println("El promedio de los números es: "+promedio);
    }
    /**
     * Estemétodo realiza la suma de dos números enteros
     * @param n1
     * @param n2
     * @return resultado
     */
    public static int sumar(int n1, int n2) {
        int resultado = n1+n2;
        return resultado;
    }

    /**
     * Sumar tres números enteros
     * @param n1
     * @param n2
     */
    public static int sumar(int n1, int n2, int n3){
        int resultado = n1+n2+n3;
        System.out.println("La suma de los números es: "+resultado);
        return resultado;
    }
    public static double obneter_promedio(int suma_total, int cantidad_num){
        double promedio = (double) suma_total/(double) cantidad_num;
        return promedio;
    }
}