package bimestre2.semana1.semana2;

public class NumeroCuadrado {
    public static void main(String[] args) {
        int numeros [] = {2,3,5,7,9,11,13};
        int tam_n = numeros.length;
        for (int indice = 0; indice <tam_n ; indice++) {
            int n_cuadrado = (numeros[indice]*numeros[indice]);
            System.out.println((numeros[indice])+" al cuadrado = "+(n_cuadrado));
        }
    }
}