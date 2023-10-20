public class Ejercicio7{
	public static void main(String[] args){
		String numero = "";	
		for(int j = 1; j < 10; j++){
			numero += j;
			System.out.printf("%9s", numero);
			for(int b = j; b >= 1; b--){
				System.out.printf("%1s", b);
			}
			System.out.printf("\n");
		}
	}

}