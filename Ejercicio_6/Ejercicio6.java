import java.util.Scanner;
public class Ejercicio6{
	public static void main(String[]args ){
		Scanner lector = new Scanner(System.in);
	
		int numero;

		System.out.println("Ingrese numero del 1 al 10 =");
		numero =Integer.parseInt(lector.nextLine());

		for(int i = 1; i <= 10; i++){
		int resultado = numero * i;
            	System.out.println(numero + " x " + i + " = " + resultado);

		}
		
	}
}