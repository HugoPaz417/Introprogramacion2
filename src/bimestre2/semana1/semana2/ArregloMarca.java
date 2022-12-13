package bimestre2.semana1.semana2;

import java.util.Scanner;

/**
 * Programa que solicite el nombre de n marcas de vehículos y las almacene en un arreglo
 * finalmente el arreglo debe mostrar el nombre de las marcas almacenadas
 */

public class ArregloMarca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marcas [];
        System.out.println("¿Cuántas marcas de vehículo va a ingresar?");
        int n = sc.nextInt();
        sc.nextLine();//para esperar un enter
        marcas = new String[n]; //Creamos el arreglo con n elementos
        for (int indice = 0; indice < n; indice++) {
            System.out.println("Ingrese el nombre de la marca: "+(indice+1));
            String marca = sc.nextLine().toLowerCase();
            marcas[indice]= marca;
        }
        System.out.println("Lista de marcas ingresadas: ");
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice]+"\t");
        }
        //Operación de búsqueda
        System.out.println("¿Qué nombre de marca quiere buscar?");
        String marca_busqueda = sc.nextLine().toLowerCase();
        for (int indice = 0; indice < n; indice++) {
            if (marca_busqueda.equals(marcas[indice])){
                System.out.println("Marca encontrada");
                System.out.println("Se encuentra el índice "+indice);
                break;
            }
        }
    }
}