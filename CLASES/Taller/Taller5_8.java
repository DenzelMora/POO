package Taller;

public class Taller5_8 {
    public static void main(String[] args) {
        // Lista predefinida de 100 números entre positivos y negativos
        int[] numeros = {
            45, -23, 67, -89, 12, -34, 78, -56, 90, -12,
            34, -67, 89, -45, 23, -78, 56, -90, 11, -33,
            88, -22, 44, -66, 99, -11, 77, -88, 33, -55,
            66, -99, 22, -44, 55, -77, 15, -35, 75, -95,
            25, -65, 85, -15, 35, -75, 95, -25, 65, -85,
            18, -38, 58, -98, 28, -48, 68, -18, 38, -58,
            98, -28, 48, -68, 13, -73, 93, -13, 73, -93,
            17, -37, 57, -97, 27, -47, 67, -17, 37, -57,
            97, -27, 47, -67, 14, -74, 94, -14, 74, -94,
            19, -39, 59, -99, 29, -49, 69, -19, 39, -59
        };
        
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        // los : puntos del blucle for sirven para recorrer la lista numeros, asignando temporalmente cada numero en la variable
        System.out.println("Lista de números:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
            
            if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            }
        }

        // Calcular medias
        double mediaPositivos = (double)sumaPositivos / contadorPositivos;
        double mediaNegativos = (double)sumaNegativos / contadorNegativos;

        // Mostrar resultados
        System.out.println("\n\nResultados:");
        System.out.printf("Media de números positivos: %.2f%n", mediaPositivos);
        System.out.printf("Media de números negativos: %.2f%n", mediaNegativos);
        System.out.println("Cantidad de números positivos: " + contadorPositivos);
        System.out.println("Cantidad de números negativos: " + contadorNegativos);
    }
}
