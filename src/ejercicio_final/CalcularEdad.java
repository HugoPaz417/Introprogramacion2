package ejercicio_final;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        System.out.println("Introduzca su fecha de nacimiento con formato dd/MM/YYYY");
        Scanner sc = new Scanner(System.in);
        int fechaNacimiento = sc.nextInt(); //Fecha de nacimiento
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss"); //Formato de fechas
        Date fechaActual = new Date(); //Fecha actual
        int date = fechaNacimiento;
        /**
         *         fechaActual.add(fechaActual.compareTo(fechaActual),fechaNacimiento ); para comparar fechas
         */
            System.out.println(fechaActual);
            System.out.println(sdf.format(fechaActual));
            System.out.println(fechaNacimiento);
            System.out.println(sdf.format(fechaNacimiento));
            System.out.println(date);
    }
}
