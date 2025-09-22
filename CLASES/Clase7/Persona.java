package Clase7;

public class Persona {
    
    // Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private double peso;
    private double altura;

    // Constructor de la clase
    public Persona(String nombre,String apellido,int edad,int cedula,double peso,double altura){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;
    }

    // Metodos Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre =  nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getCedula(){
        return cedula;
    } 

    public void setCedula(int cedula){
        this.cedula = cedula;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    // El metodo to string para mostrar los objetos
    public String toString(){

        return "Persona [ Nombre:" + nombre + " Apellido: " + apellido + " Edad: " + edad + " Cedula: " + cedula + " Peso: " + peso + " Altura: " + altura + "]";
    }

    //Metodo de saludar
    public String saludar(){
        return "Hola " + nombre + ", como te encuentras?";
    }

    // Metodo de verificar si es mayor de edad
    public boolean esMayorDeEdad(){
        if (edad >= 18){
            return true;
        }else{
            return false;
        }
    }

    // Metodo calcularIMC
    public double calcularIMC(){
        return peso / (altura * altura);
    }

}
