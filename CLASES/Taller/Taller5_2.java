package Taller;
import  java.util.Scanner;
public class Taller5_2 {
    public static void main(String[] args) {

         int month;
         int year;
         boolean bisiesto = false;


         Scanner sc = new Scanner(System.in);


            System.out.println("Ingresa el año: ");
         year = sc.nextInt();
            System.out.println("Ingresa el mes: ");
         month = sc.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            bisiesto = true;
        } 

        if(month < 1 || month > 12) {
            System.out.println("Mes inválido.");
        } else {
            int days;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    days = bisiesto ? 29 : 28;
                    break;
                default:
                    days = 0; 
            }
            System.out.println("El mes " + month + " del año " + year + " tiene " + days + " días y " + (bisiesto ? "es bisiesto." : "no es bisiesto.") );
        }
        sc.close();
    }
}