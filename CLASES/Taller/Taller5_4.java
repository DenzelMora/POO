package Taller;
import java.util.Scanner;
public class Taller5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        double numero;

        System.out.println("Ingresa números positivos (número <= 0 para terminar):");

        do {
            System.out.print("Número: ");
            numero = scanner.nextDouble();

            if (numero > 0) {
                suma += numero;
                contador++;
            }

        } while (numero > 0);

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

        scanner.close();
    }
}