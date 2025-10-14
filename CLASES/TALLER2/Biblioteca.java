package TALLER2;

public class Biblioteca {
    public static void main(String[] args) {
        
        // Creacion del primer objeto (instancia libro)
        System.out.println("--- Anadiendo ’Cien Años de Soledad ’ ---");
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 1967,496, false);

        // Uso del toString() y un getter
        System.out.println("Datos iniciales: " + libro1);
        System.out.println("Autor: " + libro1.getAutor());

        // Uso de un setter y un metodo de negocio
        libro1.setAnioPublicacion(1970);
        libro1.prestar();

        // Verificar estado con toString()
        System.out.println("Estado final: " + libro1);

        // Creacion de un segundo objeto
        //System.out.println("\n--- Añadiendo ’El señor de los anillos’ ---");
        //Libro libro2 = new Libro("El señor de los Anillos", "J.R.R. Tolken", 1954,1216 , false);
    }
}
