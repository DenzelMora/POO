package Taller;

public class Taller5_3 {
    
    public static void main(String[] args) {
        int sumDoWhile = 0;
        int i = 1;
        
        // Suma usando do-while
        do {
            sumDoWhile += i;
            i++;
        } while (i <= 100);
        System.out.println("Suma usando do-while: " + sumDoWhile);
        
        int sumWhile = 0;
        i = 1;
        
        // Suma usando while
        while (i <= 100) {
            sumWhile += i;
            i++;
        }
        System.out.println("Suma usando while: " + sumWhile);
        
        int sumFor = 0;
        
        // Suma usando for
        for (i = 1; i <= 100; i++) {
            sumFor += i;
        }
        System.out.println("Suma usando for: " + sumFor);
    }
}