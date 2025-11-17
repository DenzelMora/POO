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

        System.out.println("\n " + direccion + " desde piso " + pisoActual + " hacia piso " + pisoDestino);

        //Esto es opcional pero lo quise agregar para que sea mas dinamico 
        while (pisoActual != pisoDestino) {
            try {
                Thread.sleep(1000); // Simular tiempo de viaje
                if (direccion.equals("SUBIENDO")) {
                    pisoActual++;
                } else {
                    pisoActual--;
                }
                System.out.println("Pasando por piso " + pisoActual);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            parar();
        }

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
