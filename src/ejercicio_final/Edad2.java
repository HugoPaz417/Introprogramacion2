package ejercicio_final;

import java.util.Scanner;

public class Edad2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese año de nacimiento");
        int year_n = sc.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes_n = sc.nextInt();
        System.out.println("Ingrese dia de nacimiento");
        int dia_n = sc.nextInt();
        System.out.println("Ingrese fecha actual");
        System.out.println("Año");
        int year_a = sc.nextInt();
        System.out.println("Mes");
        int mes_a = sc.nextInt();
        System.out.println("Dia");
        int dia_a = sc.nextInt();
        System.out.println("Ingrese hora acutal");
        int hora = sc.nextInt();
        for (; year_n>0 && year_n<= year_a;){
        if ((year_n>0 && year_n<= year_a) && (mes_a<= 12 && mes_a>0) &&(mes_n<= 12 && mes_n>0) && dia_n >= 1 && dia_n<=31){
            if (mes_a == 1) {
                boolean mes1 = dia_a <= 31 && dia_a >= 1;
                if (mes1) ;
            }
            if (mes_a == 2) {
                boolean mes2 = dia_a <= 28 && dia_a >= 1;
                if (mes2) ;
            }
            if (mes_a==3){
                boolean mes3 = dia_a <= 31 && dia_a >=1;
                if (mes3);
            }
            if (mes_a==4){
                boolean mes4 = dia_a <= 30 && dia_a >=1;
                if (mes4);
            }
            if (mes_a==5){
                boolean mes5 = dia_a <= 31 && dia_a >=1;
                if (mes5);
            }
            if (mes_a==6){
                boolean mes6 = dia_a <= 30 && dia_a >=1;
                if (mes6);
            }
            if (mes_a==7){
                boolean mes7 = dia_a <= 31 && dia_a >=1;
                if (mes7);
            }
            if (mes_a==8){
                boolean mes8 = dia_a <= 31 && dia_a >=1;
                if (mes8);
            }
            if (mes_a==9){
                boolean mes9 = dia_a <= 30 && dia_a >=1;
                if (mes9);
            }
            if (mes_a==10){
                boolean mes10 = dia_a <= 31 && dia_a >=1;
                if (mes10);
            }
            if (mes_a==11){
                boolean mes11 = dia_a <= 30 && dia_a >=1;
                if (mes11);
            }
            if (mes_a==12){
                boolean mes12 = dia_a <= 31 && dia_a >=1;
                if (mes12);
            }
            int year = year_a -year_n;
            int dias_mas = year/4;
            System.out.println(year);
            int months = mes_a - mes_n;
            int m = (dia_a - dia_n);
            if (m<0) {
                m = m * -1;
                months = months + m;
            }
            int days= (dia_a - dia_n) + dias_mas;
            if (days>=31)
                months = months+1;
            while (days >=30)
                days=days-1;
            System.out.println("Edad: "+year+" años, "+months+" meses, "+days+" dias, "+hora+" horas.");
        } else {
            System.out.println("Error");
        }
            break;
        }
    }
}