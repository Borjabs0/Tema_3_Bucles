public class Ejercicio8{
	public static void main(String[] args){
		for(int i = 0; i <= 1; i++){
			String s = "" + i ;
			for(int j = 30; j <= 37; j++ ){
				System.out.printf("\n");
				for(int x = 40; x <=47; x++){
					System.out.printf("\u001B[%d;%d;%dm", i, j, x);
					System.out.printf("%d;%d;%d ", i, j, x);
					System.out.printf("\u001b[0m");	
				}			
			}
		}

	}

}