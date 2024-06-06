public class MultiplosdeTres {
    public static double resultadoFinal(int[] multiplos) {
        int suma = 0;
        for (int multiplo : multiplos) {
            if (multiplo % 3 == 0) {
                suma += multiplo;
            }
        }
        return (double) suma;
    }

    public static double promedio(int[] multiplos) {
        int suma = 0;
        int contador = 0;
        for (int multiplo : multiplos) {
            if (multiplo % 3 == 0) {
                suma += multiplo;
                contador++;
            }
        }
        return (double) suma / contador;
    }

    public static void main(String[] args) {
        int[] numeros = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            int numero = Integer.parseInt(args[i]);
            numeros[i] = numero;
        }

        double promedio = promedio(numeros);
        System.out.println(promedio);

        double suma = resultadoFinal(numeros);
        System.out.println(suma);
    }
}