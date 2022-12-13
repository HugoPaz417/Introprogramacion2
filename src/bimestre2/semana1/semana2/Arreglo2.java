package bimestre2.semana1.semana2;

public class Arreglo2 {
    public static void main(String[] args) {
        //Creacipon de arreglos, sin valores predefinidos
        String universidades[] = new String[5];
        System.out.println("Arreglo universidades: ");
        for (int indice = 0; indice < universidades.length; indice++) {
            System.out.print(universidades[indice] + "\t");
        }
        System.out.println("\n");
        int notas[] = new int[4];
        System.out.println("Arreglo notas: ");
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.print(notas[indice] + "\t");
        }
        System.out.println("\n");
        boolean valores[] = new boolean[10];
        //Creación de un arreglo cuando en un inicio no conocemos su tamaño
        String nombres[]; //declaración un arreglo de nombres
        nombres = new String[10];
    }
}