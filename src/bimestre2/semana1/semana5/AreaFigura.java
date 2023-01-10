package bimestre2.semana1.semana5;

import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribir 1 para area de circunferencia");
        System.out.println("Escribir 2 para area de un cuadrado");
        System.out.println("Escibir 3 para area de un cilindro");
        int opcion = sc.nextInt();
        seleccionar_figura(opcion);
    }
    public static void seleccionar_figura(int opcion) {
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor del radio");
                double radio = sc.nextInt();
                double area = Obtener_area_circunferencia(radio);
                System.out.println("El área es: "+area);
                break;

        }
    }
    /**
     * Método para obtener el área de una circunferencia
     * @param radio
     * @return
     */
    public static double Obtener_area_circunferencia(double radio){
        double area_circunferencia = Math.PI * Math.pow(radio,2);
        return area_circunferencia;
    }

    /**
     * Método para obtener el área de un cuadrado
     * @param lado
     * @return
     */
    public double Obtener_area_cuadrado(double lado){
        double area_cuadrado = lado*lado;
        return area_cuadrado;
    }
    public static void Obtener_area_cilindro(double radio, double altura){
        double area_cilindro = 2*Math.PI*radio*(radio+altura);
    }
}
