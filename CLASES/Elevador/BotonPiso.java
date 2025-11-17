class BotonPiso extends Boton {
    private String direccion;// "SUBIR " O "BAJAR"

    public BotonPiso(int piso, String direccion){
        super(piso);//esto lo que hace es ejecutar el constructor de la clase boton, que en caso super seria ubicacion
        this.direccion = direccion;
    }

    public String getDireccion(){
        return direccion;
    }

    @Override //lo que hace override es remplazar un metodo, para agregar mas cambios o funciones
    public void presionar(){
        super.presionar();
        System.out.println("Solicitud en piso" + ubicacion + "para" + direccion);

    }
}