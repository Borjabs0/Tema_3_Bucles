import java.util.Scanner;
public class Ejercicio8{
	public static void main(String[]args ){
		Scanner lector = new Scanner(System.in);
	
		int numero;
		int resultado = 1;

		System.out.println("Ingrese un numero=");
		numero = Integer.parseInt(lector.nextLine());

		for(int i = 1; i <= numero; i++){
		resultado = resultado * i;

		}
		System.out.println("El factorial del numero " + numero + " es = " + resultado);

		
	}
}