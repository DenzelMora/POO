class BotonElevador extends Boton {

    public BotonElevador(int pisoDestino){
        super(pisoDestino);
    }
    @Override
    public void presionar(){
        super.presionar();
        System.out.println("Destino seleccionado: Piso " + ubicacion);
    }
}