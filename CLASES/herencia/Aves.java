// Clase padre principal
class Aves {
    protected String nombre;
    
    public Aves(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
    }
}

// Clase intermedia: Ave (hereda de Aves)
class Ave extends Aves {
    
    public Ave(String nombre) {
        super(nombre);
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " emite un sonido de ave");
    }
}

// Clase para aves que VUELAN
class AveVoladora extends Ave {
    
    public AveVoladora(String nombre) {
        super(nombre);
    }
    
    public void volar() {
        System.out.println(nombre + " está volando 🦅");
    }
}

// Clase para aves que NO VUELAN
class AveNoVoladora extends Ave {
    
    public AveNoVoladora(String nombre) {
        super(nombre);
    }
    
    public void nadar() {
        System.out.println(nombre + " está nadando 🏊");
    }
}

// Ganso: Ave que SÍ vuela
class Ganso extends AveVoladora {
    
    public Ganso(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Honk honk!");
    }
}

// Pingüino: Ave que NO vuela
class Pinguino extends AveNoVoladora {
    
    public Pinguino(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Gua gua!");
    }
}