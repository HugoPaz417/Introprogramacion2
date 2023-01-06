package bimestre2.semana1.semana4;

import java.util.Scanner;

public class MatrizMarcas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        System.out.println("Ingrese las filas de la matriz");
        int filas = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz");
        int cols = sc.nextInt();
        sc.nextLine();
        String marcas[][] = new String[filas][cols];
        //llenado de la matriz: OPERACIÓN ESCRITURA
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("Ingrese la marca para la posición ["+fila+"]["+col+"]");
                marcas[fila][col] = sc.nextLine().toLowerCase();
            }
        }
        while (salir){
            System.out.println();
            System.out.println("Digite 1 para realizar una busqueda.");
            System.out.println("Digite 2 para modificar un valor: ");
            System.out.println("Digite 3 para eliminar un valor: ");
            System.out.println("Digite 4 para visualizar la matriz");
            System.out.println("Digite 5 para salir");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Has seleccionado la operacion búsqueda");
                    System.out.println("¿Qué marca busca?");
                    String marca_buscada = sc.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marca_buscada.equals(marcas[fila][col])) {
                                System.out.println("Marca encontrada en la posición [" + fila + "]" + "[" + col + "]");
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    if (encontrado)
                        System.out.println("Marca no encontrada");
                    break;
                case 2:
                    System.out.println("Has seleccionado la operacion de modificación");
                    System.out.println("Ingrese la fila que desea modificar");
                    int fila = sc.nextInt();
                    System.out.println("Ingrese la columna que desea modificar");
                    int col = sc.nextInt();
                    System.out.println("¿Cuál es la marca que va a ingresar?");
                    marcas[fila][col] = sc.nextLine();
                    break;
                case 3:
                    System.out.println("Has seleccionado la operación de eliminación");
                    System.out.println("¿Qué marca va a eliminar?");
                    String marca_eliminar = sc.nextLine().toLowerCase();
                    for (fila = 0; fila < filas; fila++) {
                        for (col = 0; col < cols; col++) {
                            if (marcas[fila][col].equals(marca_eliminar))
                                marcas[fila][col]="";
                        }
                    }
                    break;
                case 4:
                    System.out.println("Has seleccionado la operación lectura de la matriz");
                    for (fila = 0; fila < filas; fila++) {
                        for (col = 0; col < cols; col++) {
                            System.out.print(marcas[fila][col] +"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Chaowo");
                    salir=false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}