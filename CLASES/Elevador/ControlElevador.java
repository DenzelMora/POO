public class ControlElevador {
    private Ascensor ascensor;
    private BotonElevador[] botonesInternos;
    private BotonPiso[] botonesPisos;
    private int numPisos;

    public ControlElevador(int numPisos) {
        this.numPisos = numPisos;
        this.ascensor = new Ascensor(1);//inicia en el piso 1
        this.botonesInternos = new BotonElevador[numPisos + 1];//para no usar el indice 0 de los arrays

        //con este blucle lo que hago es crear un boton en el elevador por cada piso que exista
        for (int i = 1; i <= numPisos; i++) {
            botonesInternos[i] = new BotonElevador(i);
        }

        //Creamos un boton para cada piso, y si el piso es el primero solo puedo subir y en caso de que este en el ultimo piso solo puede bajar
        botonesPisos = new BotonPiso[numPisos + 1];
        for(int i = 1; i <= numPisos; i++) {
            String dir = (i == numPisos) ? "BAJAR" : "SUBIR";
            botonesPisos[i] = new BotonPiso(i,dir);//lo que hacemos es crear un boton de piso y asignarle su piso y direccion 
        }
    }

    public void solicitarAscensor(int piso) {
        
        System.out.println("\nNueva solicitud desde piso " + piso);
        
        botonesPisos[piso].presionar();
        
        // Mover ascensor al piso solicitado
        ascensor.mover(piso);
        
        // Abrir puertas
        ascensor.getPuerta().abrir();
        
        // Cancelar iluminación del botón
        botonesPisos[piso].cancelarIluminacion();
    }

    public void seleccionarPiso(int pisoDestino) {

        System.out.println("\nPasajero selecciona destino");
        
        if (pisoDestino < 1 || pisoDestino > numPisos) {
            System.out.println("Piso inválido");
            return;
        }
        
        botonesInternos[pisoDestino].presionar();
        
        // Cerrar puertas
        ascensor.getPuerta().cerrar();
        
        // Mover al destino
        ascensor.mover(pisoDestino);
        
        // Abrir puertas
        ascensor.getPuerta().abrir();
        
        // Cancelar iluminación
        botonesInternos[pisoDestino].cancelarIluminacion();
        
        // Cerrar puertas
        ascensor.getPuerta().cerrar();
    }

    
    public void mostrarEstado() {
        System.out.println("\nESTADO DEL SISTEMA");
        System.out.println("Piso actual: " + ascensor.getPisoActual());
        System.out.println("Estado: " + ascensor.getDireccion());
        System.out.println("Puertas: " + (ascensor.getPuerta().estaAbierta() ? "ABIERTAS" : "CERRADAS\n"));
    }
}
