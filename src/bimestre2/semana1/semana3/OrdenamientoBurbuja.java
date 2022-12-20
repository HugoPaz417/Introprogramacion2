package bimestre2.semana1.semana3;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int numeros[] = {20, 10, 5, 3, 2, 1};
        //controlamos el número de pasadas
        for (int indice = 0; indice < numeros.length; indice++) {
            for (int elemento = 0; elemento < numeros.length - 1; elemento++) {
                //Verificar si realizamos un intercambio ntercambio
                if (numeros[elemento] > numeros[elemento + 1]) {
                    int aux = numeros[elemento];
                    numeros[elemento] = numeros[elemento+1];
                    numeros[elemento+1] = aux;
                }
            }
        }
        //proceso para mostrar arreglo ordenado
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);

        }
    }
}