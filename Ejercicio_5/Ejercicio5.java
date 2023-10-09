
public class Ejercicio5{
	public static void main(String[] args){
	
		int pares = 0;
		int impares = 0;
		int multiplo = 0;
	
		for (int num = 1; num <= 100; num++){
			if(num % 2 == 0){
				pares = pares + 1; 
				System.out.println("El " + num + " es par ");
			} 
			else{
				impares = impares + 1; 
				System.out.println("El " + num + " es impar "); 
			}
			if(num % 5 == 0){
				multiplo = multiplo + 1;
				System.out.println(" El " + num + " tambien es multiplo de 5 ");
			}
			else{
				System.out.println(" El " + num + " no es multiplo de 5 ");
			}	
		}
		System.out.println(" ");
		System.out.println("El total de números impares son " + impares);
		System.out.println("El total de números pares son " + pares);
		System.out.println("El total de números múltiplos de 5 son " + multiplo );
	
	
	
	
	}
}