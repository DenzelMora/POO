public class SistemaControlAscensor {
    public static void main(String[] args) {

        System.out.println("SISTEMA DE CONTROL DE ASCENSOR DE 5 PISOS");

        //Primero creamos el sistema de control de 5 pisos
        ControlElevador control = new ControlElevador(5);
        
        // Mostrar estado inicial
        control.mostrarEstado();
        
        // Escenario 1: Solicitar desde piso 3
        control.solicitarAscensor(3);
        
        // Escenario 2: Pasajero selecciona piso 5
        control.seleccionarPiso(5);
        
        control.mostrarEstado();
        
        // Escenario 3: Solicitar desde piso 2
        control.solicitarAscensor(2);
        
        // Escenario 4: Ir al piso 4
        control.seleccionarPiso(4);

        // Escenario 5: Ir al piso 1
        control.seleccionarPiso(1);
        
        control.mostrarEstado();
    }
}
