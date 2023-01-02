package bimestre2.semana1.tareasemana3;

public class OrdenamientoShellSort {
    public static void main(String[] args) {
        int datos_1[] = new int[1000];
        int datos_2[] = new int[10000];
        int datos_3[] = new int[100000];
        double tiempo[] = new double[3];
        int salto = datos_1.length / 2;
        int j, k;
        int n = 1;
        int aux;
        for (int i = 0; i < 1; i++) {
            long inicio = System.nanoTime();
            for (int indice = 0; indice <= (datos_1.length - 1); indice++) {
                datos_1[indice] = n;
                n++;
            }
            while (salto > 0) {
                for (int indice = 0; indice <= datos_1.length; indice++) {
                    for (int x = salto; x < datos_1.length; x++) {
                        j = x - salto;
                        while (j >= 0) {
                            k = j + salto;
                            if (datos_1[j] <= datos_1[k]) {
                                j = -1;
                            } else {
                                aux = datos_1[j];
                                datos_1[j] = datos_1[k];
                                datos_1[k] = aux;
                                j -= salto;
                            }
                        }
                    }
                }
                salto /= 2;
            }
            for (int indice = 0; indice < datos_1.length; indice++) {
                System.out.println(datos_1[indice]);
            }
            long fin = System.nanoTime();
            long resultado = (fin - inicio)/100000;
            for (int p = 0; p < 1; p++) {
                tiempo[p] = resultado;
            }
            System.out.println("" +
                    "");
        }
        n=0;
        for (int i = 0; i < 1; i++) {
            long inicio_2 = System.nanoTime();
            for (int indice = 0; indice <= (datos_2.length - 1); indice++) {
                datos_2[indice] = n;
                n++;
            }
            while (salto > 0) {
                for (int indice = 0; indice <= datos_2.length; indice++) {
                    for (int x = salto; x < datos_2.length; x++) {
                        j = x - salto;
                        while (j >= 0) {
                            k = j + salto;
                            if (datos_2[j] <= datos_2[k]) {
                                j = -1;
                            } else {
                                aux = datos_2[j];
                                datos_2[j] = datos_2[k];
                                datos_2[k] = aux;
                                j -= salto;
                            }
                        }
                    }
                }
                salto /= 2;
            }
            for (int indice = 0; indice < datos_2.length; indice++) {
                System.out.println(datos_2[indice]);
            }
            long fin_2 = System.nanoTime();
            long resultado_2 = (fin_2 - inicio_2)/100000;
            for (int p = 1; p < 2; p++) {
                tiempo[p] = resultado_2;
            }
            System.out.println("" +
                    "");
        }
        n=0;
        for (int i = 0; i < 1; i++) {
            long inicio_3 = System.nanoTime();
            for (int indice = 0; indice <= (datos_3.length - 1); indice++) {
                datos_3[indice] = n;
                n++;
            }
            while (salto > 0) {
                for (int indice = 0; indice <= datos_3.length; indice++) {
                    for (int x = salto; x < datos_3.length; x++) {
                        j = x - salto;
                        while (j >= 0) {
                            k = j + salto;
                            if (datos_3[j] <= datos_3[k]) {
                                j = -1;
                            } else {
                                aux = datos_3[j];
                                datos_3[j] = datos_3[k];
                                datos_3[k] = aux;
                                j -= salto;
                            }
                        }
                    }
                }
                salto /= 2;
            }
            for (int indice = 0; indice < datos_3.length; indice++) {
                System.out.println(datos_3[indice]);
            }
            long fin_3 = System.nanoTime();
            long resultado_3 = (fin_3 - inicio_3)/100000;
            for (int p = 2; p == 2; p++) {
                tiempo[p] = resultado_3;
            }
            System.out.println("" +
                    "");
        }
        for (int p = 0; p <= 2; p++) {
            System.out.println("El proceso "+(p+1)+" duró "+tiempo[p]);
        }
    }
}