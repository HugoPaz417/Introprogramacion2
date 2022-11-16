package repeticion_while;

/**
 *Generar la tabla de multiiplicar hasta el 10 de un numero ingresado por teclado
 */
import javax.swing.*;

public class TablaMultiplicar {
    public static void main(String[] args) {
        //System.out.println("PROGRAMA PARA GENERAR LA TABLA DE  MULTIPLICAR");
        JOptionPane.showMessageDialog(null, "PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR");
        String num = JOptionPane.showInputDialog("Ingrese un número: ");
        int contador =1;
        String acumulador = "";
        while (contador <= 100 ){
            int mult = Integer.parseInt(num) * contador;//convertimos valor string a int
            String salida = num + " x " + String.valueOf(contador) +"=" + String.valueOf(mult) + "\n";
            acumulador = acumulador + salida;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null, acumulador);
    }
}