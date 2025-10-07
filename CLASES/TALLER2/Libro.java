package TALLER2;
public class Libro {
    
    // Atributos (encapsulandolos en private)
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int numeroPaginas;
    private boolean prestado;

    // Constructor 
    public Libro(String titulo,String autor,int anioPublicacion,int numeroPaginas, boolean prestado){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.prestado = false; //Estado inicial
    }

    // Getters(lectura)
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    //Setters(Escritura/Modificaciones)
    public void setAnioPublicacion(int anio){
        if(anio <= 2025 && anio > 0){
            this.anioPublicacion = anio;
        }else {
            System.out.println("Error: Año de  invalido.");
        }
    }

    // Metodos de Negocio (Comportamiento)
    public boolean prestar(){
        if (!this.prestado){
            this.prestado = true;
            System.out.println("El libro ’"+ this.titulo + "’ ha sido prestado.");
            return true;
        } else {
            System.out.println("El libro ’"+ this.titulo + "’ ya esta prestado.");
            return false;
        }
    }    

    // Metodo toString()
    @Override
    public String toString(){
        String estado = this.prestado ? "PRESTADO" : "DISPONIBLE";
        return " Libro [ Titulo : " + titulo +
               ", Autor : " + autor +
               ", Ano: " + anioPublicacion +
               ", Paginas : " + numeroPaginas +
               ", Estado : " + estado +
               "]";

    }
}   
