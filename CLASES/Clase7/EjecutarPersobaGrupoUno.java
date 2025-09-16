package Clase7;

public class EjecutarPersobaGrupoUno {
    public static void main(String[] args) {
         
        // Forma 1
        //Creacion del objeto objPersona1
        Persona objPersona1;
        //Instanciar el objeto (new) --> Instanciar es igual a crear (Darle vida al objeto)
        objPersona1 = new Persona("Denzel","Mora",17,11072025,62);

        // Forma2
        Persona objPersona2 = new Persona("Byron", "Cano", 35, 1001980, 60.0);

        // Mostrar por pantalla el objeto creado
        System.out.println(objPersona1.toString());
        System.out.println(objPersona2.toString());

        // Mostrar el nombre de la persona
        System.out.println(objPersona1.getNombre());

        // Modificar el nombre de la persona 2
        objPersona2.setNombre("Harvin");
        
        // Mostrar el objPersona2 con la modificacion del nombre
        System.out.println(objPersona2.toString());
    }
}
