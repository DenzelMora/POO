package Taller;

public class Taller5_5 {
    
 
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 1000:");
        
        for (int i = 2; i <= 1000; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}