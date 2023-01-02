package bimestre2.semana1.tareasemana3;

public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        int datos_1[] = new int[1000];
        int datos_2[] = new int[10000];
        int datos_3[] = new int[100000];
        double tiempo[] = new double[3];
        int n = 1;
        int menor, pos, tem;
        for (int x = 0; x < 1; x++) {
            long inicio = System.nanoTime();
            for (int i = 0; i < datos_1.length; i++) {
                datos_1[i] = n;
                n++;
            }
            for (int i = 0; i < datos_1.length; i++) {
                menor = datos_1[i];
                pos = i;
                for (int j = i + 1; j < datos_1.length; j++) {
                    if (datos_1[j] < menor) {
                        menor = datos_1[j];
                        pos = j;
                    }
                }
                if (pos != i) {
                    tem = datos_1[i];
                    datos_1[i] = datos_1[pos];
                    datos_1[pos] = datos_1[tem];
                }
            }
            for (int i = 0; i < datos_1.length; i++) {
                System.out.println(datos_1[i]);
            }
            long fin = System.nanoTime();
            long resultado = (fin - inicio)/100000;
            for (int j = 0; j < 1; j++) {
                tiempo[j] = resultado;
            }
            System.out.println("" +
                    "" +
                    "");
        }
        n=0;
        for (int x = 0; x < 1; x++) {
            long inicio_2 = System.nanoTime();
            for (int i = 0; i < datos_2.length; i++) {
                datos_2[i] = n;
                n++;
            }
            for (int i = 0; i < datos_2.length; i++) {
                menor = datos_2[i];
                pos = i;
                for (int j = i + 1; j < datos_2.length; j++) {
                    if (datos_2[j] < menor) {
                        menor = datos_2[j];
                        pos = j;
                    }
                }
                if (pos != i) {
                    tem = datos_2[i];
                    datos_2[i] = datos_2[pos];
                    datos_2[pos] = datos_2[tem];
                }
            }
            for (int i = 0; i < datos_2.length; i++) {
                System.out.println(datos_2[i]);
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
        for (int x = 0; x < 1; x++) {
            long inicio_3 = System.nanoTime();
            for (int i = 0; i < datos_3.length; i++) {
                datos_3[i] = n;
                n++;
            }
            for (int i = 0; i < datos_3.length; i++) {
                menor = datos_3[i];
                pos = i;
                for (int j = i + 1; j < datos_3.length; j++) {
                    if (datos_3[j] < menor) {
                        menor = datos_3[j];
                        pos = j;
                    }
                }
                if (pos != i) {
                    tem = datos_3[i];
                    datos_3[i] = datos_3[pos];
                    datos_3[pos] = datos_3[tem];
                }
            }
            for (int i = 0; i < datos_3.length; i++) {
                System.out.println(datos_3[i]);
            }
            long fin_3 = System.nanoTime();
            long resultado_3 = (fin_3 - inicio_3)/100000;
            for (int j = 2; j == 2; j++) {
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