public class condicionales_c {
    public static void main(String[] args) {
        int numero = -5; 
        int totalPositivos = 30;
        int totalNegativos = 20;

        if (numero > 0) {
            totalPositivos += numero;
             System.out.println("Total de positivos: " + totalPositivos);
        } else {
            totalNegativos += numero;
            System.out.println("Total de negativos: " + totalNegativos);
    }
        }   
}
