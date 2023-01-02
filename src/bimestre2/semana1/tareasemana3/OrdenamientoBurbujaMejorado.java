package bimestre2.semana1.tareasemana3;

public class OrdenamientoBurbujaMejorado {
        public static void main(String[] args) {
            int datos_1[] = new int[1000];
            int datos_2[] = new int[10000];
            int datos_3[] = new int[100000];
            double tiempo[] = new double[3];
            int n = 0;
            boolean cambio;
            for (int j = 0; j < datos_1.length; j++) {
                datos_1[j] = n;
                n++;
            }
            for (int x = 0; x < 1; x++) {
                long inicio = System.nanoTime();
                for (int i = (datos_1.length - 1); i > 0; i--) {
                    cambio = false;
                    for (int j = 0; j < i; j++) {
                        if (datos_1[j + 1] - (datos_1[j]) >= 0) {
                            int aux = datos_1[j];
                            datos_1[j] = datos_1[j + 1];
                            datos_1[j + 1] = aux;
                            cambio = true;
                        }
                    }
                    if (!cambio)
                        break;
                }
                for (int j = (datos_1.length - 1); j >= 0; j--) {
                    System.out.println(datos_1[j]);
                }
                long fin = System.nanoTime();
                long resultado = (fin - inicio) / 100000;
                for (int t = 0; t < 1; t++) {
                    tiempo[t] = resultado;
                }
            }
            n = 0;
            for (int j = 0; j < datos_2.length; j++) {
                datos_2[j] = n;
                n++;
            }
            for (int x = 0; x < 1; x++) {
                long inicio_2 = System.nanoTime();
                for (int i = (datos_2.length - 1); i > 0; i--) {
                    cambio = false;
                    for (int j = 0; j < i; j++) {
                        if (datos_2[j + 1] - (datos_2[j]) >= 0) {
                            int aux = datos_2[j];
                            datos_2[j] = datos_2[j + 1];
                            datos_2[j + 1] = aux;
                            cambio = true;
                        }
                    }
                    if (!cambio)
                        break;
                }
                for (int j = (datos_2.length - 1); j >= 0; j--) {
                    System.out.println(datos_2[j]);
                }
                long fin_2 = System.nanoTime();
                long resultado_2 = (fin_2 - inicio_2) / 100000;
                for (int t = 1; t < 2; t++) {
                    tiempo[t] = resultado_2;
                }
            }
            n = 0;
            for (int j = 0; j < datos_3.length; j++) {
                datos_3[j] = n;
                n++;
            }
            for (int x = 0; x < 1; x++) {
                long inicio_3 = System.nanoTime();
                for (int i = (datos_3.length - 1); i > 0; i--) {
                    cambio = false;
                    for (int j = 0; j < i; j++) {
                        if (datos_3[j + 1] - (datos_3[j]) >= 0) {
                            int aux = datos_3[j];
                            datos_3[j] = datos_3[j + 1];
                            datos_3[j + 1] = aux;
                            cambio = true;
                        }
                    }
                    if (!cambio)
                        break;
                }
                for (int j = (datos_3.length - 1); j >= 0; j--) {
                    System.out.println(datos_3[j]);
                }
                long fin_3 = System.nanoTime();
                long resultado_3 = (fin_3 - inicio_3)/100000;
                for (int t = 2; t == 2; t++) {
                    tiempo[t] = resultado_3;
                }
            }
            for (int t = 0; t <= 2; t++) {
                System.out.println("El proceso "+(t+1)+" duró "+tiempo[t]);
            }
        }
}