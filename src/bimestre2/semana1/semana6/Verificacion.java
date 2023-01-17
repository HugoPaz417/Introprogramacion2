package bimestre2.semana1.semana6;

/**
 * Programa para verificar a través de métodos si un número es primo y si es par o impar
 */
public class Verificacion {
    public boolean verificar_primo(int num_a_verificar) {
        int contador_divisores = 0;
        for (int cont = 1; cont <= num_a_verificar; cont++) {
            if (num_a_verificar % cont == 0)//detectamos un nuevo divisor
                contador_divisores++;
        }
        if (contador_divisores == 2)  //verificamos si es primo
            return true;
        else
            return false;
    }

    public boolean verificar_par(int num_a_verificar) {
        if (num_a_verificar % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Verificacion mivariable = new Verificacion();
        int n = 5;
        if (mivariable.verificar_primo(n)==true)
            System.out.println("es primo");
        else
            System.out.println("no es primo");
        if (mivariable.verificar_par(n)==true)
            System.out.println("es par");
        else
            System.out.println("es impar");
    }
}