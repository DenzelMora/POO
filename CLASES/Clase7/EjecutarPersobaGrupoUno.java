package Clase7;

public class EjecutarPersobaGrupoUno {
    public static void main(String[] args) {
         
        // Forma 1
        //Creacion del objeto objPersona1
        Persona objPersona1;
        //Instanciar el objeto (new) --> Instanciar es igual a crear (Darle vida al objeto)
        objPersona1 = new Persona("Denzel","Mora",17,11072025,60.0,1.83);

        // Forma2
        Persona objPersona2 = new Persona("Byron", "Cano", 35, 1001980, 60.0,1.74);

        Persona objPersona3 = new Persona("Jorge", "Guataqui", 52, 11098765, 70, 1.74);

        Persona objPersona4 = new Persona("Naomi", "Viera", 22, 14374900, 56,1.70);

        Persona objPersona5 = new Persona("Zuleima","Banguera", 45 , 63894655, 80, 1.68 );

        // Mostrar por pantalla el objeto creado
        System.out.println(objPersona1.toString());
        System.out.println(objPersona2.toString());
        System.out.println(objPersona3.toString());
        System.out.println(objPersona4.toString());
        System.out.println(objPersona5.toString());

        // Mostrar el nombre de la persona
        System.out.println(objPersona1.getNombre());

        // Modificar el nombre de la persona 2
        objPersona2.setNombre("Harvin");
        
        // Mostrar el objPersona2 con la modificacion del nombre
        System.out.println(objPersona2.toString());

        //Saludo
        System.out.println(objPersona5.saludar());

        // Es mayor de edad 
        System.out.println(objPersona1.esMayorDeEdad());

        // Calcular imc
        System.out.println("El imc de la persona es de: " + objPersona4.calcularIMC());
    }
}
