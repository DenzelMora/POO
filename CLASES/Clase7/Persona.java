package Clase7;

public class Persona {
    
    // Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private double peso;

    // Constructor de la clase
    public Persona(String nombre,String apellido,int edad,int cedula,double peso){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.peso = peso;
    }

    // Metodos Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre =  nombre;
    }

    // El metodo to string para mostrar los objetos
    public String toString(){

        return "Persona [ Nombre:" + nombre + " Apellido: " + apellido + " Edad: " + edad + " Cedula: " + cedula + " Peso: " + peso + "]";
    }
}
