class Puerta {
    private boolean abierta;
    private boolean mantenerAbierta;

    public Puerta (){

        this.abierta = false;
        this.mantenerAbierta = false;

    }

    public void abrir() {
        abierta = true;
        System.out.println("Puertas abiertas");
    }

    public void cerrar() {
        if (mantenerAbierta) {
            System.out.println("Puertas mantenidas abiertas");
            return;
        }
        abierta = false;
        System.out.println("Puertas cerradas");
    }
    
    public void setMantenerAbierta(boolean mantener) {
        mantenerAbierta = mantener;
    }
    
    public boolean estaAbierta() {
        return abierta;
    }

}