import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el número base (a): ");
        double a = lector.nextDouble();

        System.out.print("Ingrese el exponente (b): ");
        int b = lector.nextInt();

        double resultado = calcularPotencia(a, b);

        System.out.println(a + " elevado a la " + b + " es igual a " + resultado);
    }

    public static double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1; // Cualquier número elevado a 0 es 1
        } else if (exponente < 0) {
            // Si el exponente es negativo, calculamos la inversa de la potencia positiva
            return 1 / calcularPotencia(base, -exponente);
        } else {
            double resultado = 1.0;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            return resultado;
        }
    }
}
