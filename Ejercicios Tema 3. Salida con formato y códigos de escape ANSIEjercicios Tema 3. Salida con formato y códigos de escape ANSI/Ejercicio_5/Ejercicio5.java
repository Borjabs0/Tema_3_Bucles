public class Ejercicio5{
	public static void main(String[] args){
		String numero = " ";
		
    		for(int j = 1; j <= 9; j++){
			numero += j;	
           		System.out.printf("\u001B[" + (29 + j) + "m %10s \u001B[0m\n", numero);
		}
	
	}
}