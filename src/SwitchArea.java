import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1, 2 o 3"+ teclado);
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Area triangulo");
                System.out.println("Ingrese base");
                double base = teclado.nextDouble();
                System.out.println("Ingrese altura");
                double altura = teclado.nextDouble();
                double area_triangulo = (base * altura)/2;
                System.out.println("el area es: "+area_triangulo);
                break;
            case 2:
                System.out.println("Area de una circunferencia");
                System.out.println("Ingrese el radio");
                double radio = teclado.nextDouble();
                System.out.println("valor de PI: "+ Math.PI);
                double area_circunferencia = (radio * radio) * Math.PI;
                System.out.println("el area es: "+area_circunferencia);
                break;
            case 3:
                System.out.println("Area de un cuadrado");
                System.out.println("Ingrese el valor del lado");
                double lado = teclado.nextDouble();
                double area_cuadrado = (lado * lado);
                System.out.println("el area es: "+area_cuadrado);
        }
    }
}