package ejercicio_final;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Edad {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese fecha de nacimiento en formato dd/MM/YYYY");
        String fechaCadena = sc.nextLine();
        Date fechaConvertida= StringADate(fechaCadena);
        if (fechaConvertida != null) {
            System.out.println(fechaConvertida);
            Date fechaActual = new Date();
            System.out.println(fechaActual);
            System.out.println(sdf.format(fechaActual));
            long fechaInicio = fechaActual.getTime();
            long fechaFin = fechaConvertida.getTime();
            long edadActual = fechaInicio - fechaFin;
            double dias = Math.floor(edadActual/(1000*60*60*24));
            //1000 milisegundos = 1 segundo
            // 60 segundos = 1 minuto
            // 60 minutos = 1 hora
            // 24 horas = 1 día
            double years = Math.floor(dias/365);
            System.out.println("Tienes "+years+" años ");
            System.out.println(fechaActual);
            }
        }
        public static Date StringADate (String fechaCadena){
            Date fecha=null;
            try {
                fecha=sdf.parse(fechaCadena);
            } catch (ParseException e) {
                System.out.println("Error en la conversión");
            }
            return fecha;
        }
}