public class Ejercicio6{
	public static void main(String[] args){
		String numero = "";		
		for(int j = 1; j < 10; j++){
			numero += j;
			System.out.printf("%20s%s\n", numero, numero);
		}
	}
}