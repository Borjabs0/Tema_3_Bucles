import java.util.Scanner;
public class Ejercicio1{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		double numero;
		System.out.println("Escribe un numero");
		numero = Double.parseDouble(lector.nextLine());
		System.out.printf("%.2f\n", numero);

	}
}