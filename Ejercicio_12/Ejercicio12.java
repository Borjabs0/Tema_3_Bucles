import java.util.Random;
import java.util.Scanner;
public class Ejercicio12{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int aleatorio = 0;
		int intentos;
		int numero = 0;
		System.out.println("Tienes 5 intentos para acertar el numero ");
		do{
			for (intentos = 1; intentos <= 5; intentos++){
				System.out.println("Ingrese un número: ");
        			numero = Integer.parseInt(scanner.nextLine());
				aleatorio = random.nextInt(1);
				if (aleatorio == numero){
					System.out.println("El numero es corecto ");
					break;
				
				}
				else{
					System.out.println("Lo siento el numero es incorrecto " + " El numero correcto era = " + aleatorio );
					System.out.println("");
				 }
			}
		}while (aleatorio != numero && intentos <=5);
		
	}
}