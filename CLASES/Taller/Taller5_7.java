package Taller;

import java.util.List;
import java.util.ArrayList;

public class Taller5_7 {
    
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();
        notas.add(3);
        notas.add(5);
        notas.add(7);
        notas.add(9);
        notas.add(10);

        for (int i = 0;i < 5;i++){
            if ((notas.get(i) >= 7) && (notas.get(i) <= 9)){
                System.out.println("Un Estudiante tiene una calificacion notable de " + notas.get(i));
            }
        }

    }

}
