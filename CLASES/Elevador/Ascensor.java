class Ascensor {
    private int pisoActual;
    private String direccion;
    private boolean enMovimiento;
    private Puerta puerta;//Un ascensor tiene una puerta asi que guardamos puerta como un objeto dentro de la clase ascensor

    public Ascensor(int pisoInicial){
        this.pisoActual = pisoInicial;
        this.direccion = "DETENIDO";
        this.enMovimiento = false;
        this.puerta = new Puerta();
    }

    public void mover(int pisoDestino) {
        if (pisoDestino == pisoActual) {
            System.out.println("Ya estás en el piso " + pisoActual);
            return;
        }
        
        enMovimiento = true;
        direccion = (pisoDestino > pisoActual) ? "SUBIENDO" : "BAJANDO";
        
        System.out.println("\n" + direccion + " desde piso " + pisoActual + " hacia piso " + pisoDestino);
        
        // Mover directamente al destino
        pisoActual = pisoDestino;
        System.out.println("Llegó al piso " + pisoActual);
        
        parar();
    }

    public void parar() {
        enMovimiento = false;
        direccion = "DETENIDO";
        System.out.println("Ascensor detenido en piso " + pisoActual);
    }
    
    public int getPisoActual() {
        return pisoActual;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public Puerta getPuerta() {
        return puerta;
    }
    
    public boolean estaEnMovimiento() {
        return enMovimiento;
    }
}
