public class Ejercicio5{
	public static void main(String[] args){
		int i, b, j;
		for(i = 1; i < 10; i++){
			for (b = 1; b <= 10 - i; b++) {
                		System.out.print(" ");
            		}
			for(j = 1; j <= i; j++){
				System.out.print(j);
           			//System.out.printf("\u001B[1;3 " "m%9s\u001B[0m hola \n");
			}
		System.out.println();
		}
	
	
	
	}
}