public class Expresiones {
    public static void main(String[] args) {
        /*
         * Evaluar la siguiente expresion para A = 2 y B = 5: 3 * A - 4 * B / A ^ 2
         */
        int a = 2;
        int b = 5;
        int c = 1;

        System.out.println(3 * a - 4 * b / Math.pow(a,2));/*El math.pow sirve para elevar un numero */

        //Ejercicios 3.6 3.7 3.8

        //3.6
        System.out.println(Math.sqrt(Math.pow(b, 2) - 4 * a * c));
    }
}