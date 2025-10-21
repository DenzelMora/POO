// Clase principal
public class Main {
    public static void main(String[] args) {
        System.out.println("=== AVES QUE VUELAN VS AVES QUE NO VUELAN ===\n");
        
        // Crear un ganso (ave voladora)
        Ganso miGanso = new Ganso("Paul");
        
        // Crear un pingüino (ave no voladora)
        Pinguino miPinguino = new Pinguino("Roberto");
        
        // Demostración del Ganso
        System.out.println("--- GANSO (VUELA) ---");
        miGanso.mostrarInfo();
        miGanso.hacerSonido();
        miGanso.volar();
        
        System.out.println("\n--- PINGÜINO (NO VUELA) ---");
        miPinguino.mostrarInfo();
        miPinguino.hacerSonido();
        miPinguino.nadar();
        
        // Demostración de polimorfismo
        System.out.println("\n--- POLIMORFISMO ---");
        Ave[] aves = {miGanso, miPinguino};
        
        System.out.println("Todas las aves hacen sonidos:");
        for (Ave ave : aves) {
            ave.hacerSonido();
        }
    }
}