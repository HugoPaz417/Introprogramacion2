package bimestre2.semana1.tareasemana3;

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        int datos_1[] = new int[1000];
        int datos_2[] = new int[10000];
        int datos_3[] = new int[100000];
        double tiempo[] = new double[3];
        int n = 0;
        int aux;
        for (int i = 0; i < 1; i++) {
            long inicio = System.nanoTime();
            for (int indice = (datos_1.length - 1); indice >= 0; indice--) {
                datos_1[indice] = n;
                n++;
            }
            for (int cont1 = 1; cont1 < datos_1.length; cont1++) {
                aux = datos_1[cont1];
                for (int cont2 = (cont1 - 1); cont2 >= 0 && datos_1[cont2] > aux; cont2--) {
                    datos_1[cont2 + 1] = datos_1[cont2];
                    datos_1[cont2] = aux;
                }
            }
            for (int indice = 0; indice <= (datos_1.length - 1); indice++) {
                System.out.println(datos_1[indice]);
            }
            long fin = System.nanoTime();
            long resultado = (fin - inicio)/100000;
            for (int j = 0; j < 1; j++) {
                tiempo[j] = resultado;
            }
            System.out.println("" +
                    "" +
                    "");        }
        n=0;
        for (int i = 0; i < 1; i++) {
            long inicio_2 = System.nanoTime();
            for (int indice = (datos_2.length - 1); indice >= 0; indice--) {
                datos_2[indice] = n;
                n++;
            }
            for (int cont1 = 1; cont1 < datos_2.length; cont1++) {
                aux = datos_2[cont1];
                for (int cont2 = (cont1 - 1); cont2 >= 0 && datos_2[cont2] > aux; cont2--) {
                    datos_2[cont2 + 1] = datos_2[cont2];
                    datos_2[cont2] = aux;
                }
            }
            for (int indice = 0; indice <= (datos_2.length - 1); indice++) {
                System.out.println(datos_2[indice]);
            }
            long fin_2 = System.nanoTime();
            long resultado_2 = (fin_2 - inicio_2)/100000;
            for (int j = 1; j < 2; j++) {
                tiempo[j] = resultado_2;
            }
            System.out.println("" +
                    "" +
                    "");
        }
        n=0;
        for (int i = 0; i < 1; i++) {
            long inicio_3 = System.nanoTime();
            for (int indice = (datos_3.length - 1); indice >= 0; indice--) {
                datos_3[indice] = n;
                n++;
            }
            for (int cont1 = 1; cont1 < datos_3.length; cont1++) {
                aux = datos_3[cont1];
                for (int cont2 = (cont1 - 1); cont2 >= 0 && datos_3[cont2] > aux; cont2--) {
                    datos_3[cont2 + 1] = datos_3[cont2];
                    datos_3[cont2] = aux;
                }
            }
            for (int indice = 0; indice <= (datos_3.length - 1); indice++) {
                System.out.println(datos_3[indice]);
            }
            long fin_3 = System.nanoTime();
            long resultado_3 = (fin_3 - inicio_3)/100000;
            for (int j = 2; j ==2; j++) {
                tiempo[j] = resultado_3;
            }
            System.out.println("" +
                    "" +
                    "");
        }
        for (int j = 0; j <= 2; j++) {
            System.out.println("El proceso "+(j+1)+" duró "+tiempo[j]);
        }
    }
}