class Boton{
    protected boolean iluminado;
    protected int ubicacion; //Esta variable sirve para saber la ubicacion de ese

    public Boton(int ubicacion ){
        this.ubicacion = ubicacion;
        this.iluminado = iluminado;
    }

    public void presionar(){
        iluminado = true ;
        System.out.println("Beep - Botón presionado");
    }

    public void cancelarIluminacion(){
        iluminado = false;
    }

    public boolean estaIluminado(){
        return iluminado;
    }

    public int getUbicacion(){
        return ubicacion;
    }
}