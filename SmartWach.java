import java.util.ArrayList;

public class SmartWach {
    public static ArrayList<Integer> clearSteps(int[] pasos) {
        ArrayList<Integer> pasosFiltrados = new ArrayList<>();

        for (int paso : pasos) {
            if (paso > 200 && paso < 100000) {
                pasosFiltrados.add(paso);
            }
        }
        return pasosFiltrados;
    }
    public static double calcularPromedio(ArrayList<Integer> pasos) {
        int suma = 0;
        for (int paso : pasos) {
            suma += paso;
        }
        return (double) suma / pasos.size();
    }

    public static void main(String[] args) {
        int[] pasos = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            pasos[i] = Integer.parseInt(args[i]);
        }
        ArrayList<Integer> promedioPasos = clearSteps(pasos);
            System.out.println("El promedio es: " + promedioPasos);
    }
}
