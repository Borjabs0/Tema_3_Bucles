public class Ejercicio4{
	public static void main(String[] args){
		int impares = 0;
		
		for (int i = 1; i <= 100; i++){
			if(i%2 !=0){
				impares = impares + 1; 
				System.out.println("Números impares " + i); 
			
			}
		}
		System.out.println("Total de números impares " + impares); 
	}
}