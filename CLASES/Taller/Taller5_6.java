package Taller;

import java.util.Scanner;

public class Taller5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEstudiantes;
        int aprobados = 0;
        
        System.out.print("Ingrese el número total de estudiantes: ");
        totalEstudiantes = scanner.nextInt();
        
        for (int i = 1; i <= totalEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante " + i + ": ");
            double calificacion = scanner.nextDouble();
            
            if (calificacion >= 5.0) { 
                aprobados++;
            }
        }
        
        System.out.println("\nResultados:");
        System.out.println("Total de estudiantes: " + totalEstudiantes);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + (totalEstudiantes - aprobados));
        
        scanner.close();
    }
}