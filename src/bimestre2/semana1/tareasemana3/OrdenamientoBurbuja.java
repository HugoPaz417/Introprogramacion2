package bimestre2.semana1.tareasemana3;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int numeros[] = new int[1000];
        int numeros_2[] = new int[10000];
        int numeros_3[] = new int[100000];
        double tiempo[] = new double[3];
        int n = 1;
        for (int i = 0; i < 1; i++) {
            long inicio = System.nanoTime();
            for (int indice = 0; indice < numeros.length; indice++) {
                numeros[indice] = n;
                n++;
            }
            for (int indice = 0; indice < numeros.length; indice++) {
                for (int elemento = 0; elemento < numeros.length - 1; elemento++) {
                    if (numeros[elemento] > numeros[elemento + 1]) {
                        int aux = numeros[elemento];
                        numeros[elemento] = numeros[elemento + 1];
                        numeros[elemento + 1] = aux;
                    }
                }
            }
            for (int indice = 0; indice < numeros.length; indice++) {
                System.out.println(numeros[indice]);
            }
            long fin = System.nanoTime();
            long resultado = (fin-inicio)/100000;
            for (int j = 0; j < 1; j++) {
                tiempo[j]=resultado;
            }
        }
        n=1;
        for (int i = 0; i < 1; i++) {
            long inicio_2 = System.nanoTime();
            for (int indice = 0; indice < numeros_2.length; indice++) {
                numeros_2[indice] = n;
                n++;
            }
            for (int indice = 0; indice < numeros_2.length; indice++) {
                for (int elemento = 0; elemento < numeros_2.length - 1; elemento++) {
                    //Verificar si realizamos un intercambio
                    if (numeros_2[elemento] > numeros_2[elemento + 1]) {
                        int aux = numeros_2[elemento];
                        numeros_2[elemento] = numeros_2[elemento + 1];
                        numeros_2[elemento + 1] = aux;
                    }
                }
            }
            for (int indice = 0; indice < numeros_2.length; indice++) {
                System.out.println(numeros_2[indice]);
            }
            long fin_2 = System.nanoTime();
            long resultado_2 = (fin_2-inicio_2)/100000;
            for (int j = 1; j < 2; j++) {
                tiempo[j]=resultado_2;
            }
        }
        n=1;
        for (int i = 0; i < 1; i++) {
            long inicio_3 = System.nanoTime();
            for (int indice = 0; indice < numeros_3.length; indice++) {
                numeros_3[indice] = n;
                n++;
            }
            for (int indice = 0; indice < numeros_3.length; indice++) {
                for (int elemento = 0; elemento < numeros_3.length - 1; elemento++) {
                    if (numeros_3[elemento] > numeros_3[elemento + 1]) {
                        int aux = numeros_3[elemento];
                        numeros_3[elemento] = numeros_3[elemento + 1];
                        numeros_3[elemento + 1] = aux;
                    }
                }
            }
            for (int indice = 0; indice < numeros_3.length; indice++) {
                System.out.println(numeros_3[indice]);
            }
            long fin_3 = System.nanoTime();
            long resultado_3 = (fin_3-inicio_3)/100000;
            for (int j = 2; j == 2; j++) {
                tiempo[j]=resultado_3;
            }
        }
        for (int j = 0; j <= 2; j++) {
            System.out.println("El proceso "+(j+1)+" duró "+tiempo[j]);
        }
    }
}