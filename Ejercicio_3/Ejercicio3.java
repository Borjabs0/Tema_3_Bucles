import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int num1, num2;
		System.out.println("Indica el primer operando: ");
		num1 = Integer.parseInt(lector.nextLine());
		System.out.println("Indica el segundo operando: ");
		num2 = Integer.parseInt(lector.nextLine());
		int suma = 0;
		for (int i = 1; i <= num1; i++)
			suma = suma + num2; 
			System.out.println(num1 + " x " + num2 + " = " + suma);
	}
}