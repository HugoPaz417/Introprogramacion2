package bimestre2.semana1.semana6;

public class AmbitoVariable {
    static int numero = 10; //creación de variable global
    public static void cambiar_valor() {
        numero+=15;
        int valor = 5;
    }
    public void cambiar_valor(int numero){
        this.numero+=50;
    }
    public static void main(String[] args) {
        cambiar_valor();
        int indice;
        System.out.println("El nuevo valor de número es = "+numero);
        AmbitoVariable mivariable = new AmbitoVariable();
        mivariable.cambiar_valor(100);
        System.out.println("El nuevo valor de número es = "+numero);
        for (indice = 0; indice < 5; indice++) {
            System.out.println("Repetición "+indice);
        }
        System.out.println("El valor final de indice: "+indice);
    }
}