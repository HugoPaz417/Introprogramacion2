package bimestre2.semana1.semana3;

import java.util.Scanner;

public class FichaClase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombres[] = new String[100];
        int edad []= new int [100];
        String univ[]= new String[100];
        boolean interruptor = true;
        int indice = 0;
        while (interruptor) {
            System.out.println("Ingrese datos del estudiante");
            System.out.println("Ingrese nombre: ");
            nombres[indice] = sc.nextLine();
            System.out.println("Ingrese edad");
            edad[indice] = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese universidad");
            univ[indice]=sc.nextLine();
            indice++;
            System.out.println("Desea ingresar un nuevo estudiante? si/no");
            String resp = sc.nextLine().toLowerCase();
            if (resp.equals("no"))
                interruptor=false;
        }
        //Ordenar arreglo por edad
        System.out.println("Ordenar arreglo por edad");
        for (int indice_iwi = 0; indice_iwi < edad.length; indice_iwi++) {
            for (int elemento = 0; elemento < edad.length - 1; elemento++) {
                //Verificar si realizamos un intercambio ntercambio
                if (edad[elemento] > edad[elemento + 1]) {
                    int aux = edad[elemento];
                    edad[elemento] = edad[elemento+1];
                    edad[elemento+1] = aux;
                    //procesos de intercambio en arreglo nombres
                    String aux_n = nombres[elemento];
                    nombres[elemento]=nombres[elemento+1];
                    nombres[elemento+1]=aux_n;
                    //proceso de intercambio en arreglo universidades
                    String aux_u = univ[elemento];
                    univ[elemento]=univ[elemento+1];
                    univ[elemento+1]=aux_u;
                }
            }
        }
        //presentar datos de los estudiantes
        for (int pos = 0; pos < nombres.length; pos++) {
            if (nombres[pos]!=null) {
                System.out.println("Nombres: " + nombres[pos]);
                System.out.println("Edad: " + edad[pos]);
                System.out.println("Universidades: " + univ[pos]);
            }
        }
    }
}