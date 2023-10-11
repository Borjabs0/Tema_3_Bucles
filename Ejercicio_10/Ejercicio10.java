import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int numero;
	int suma = 0;
		do{
			System.out.print("Ingrese un número: ");
        		numero = scanner.nextInt();
			suma += numero; 

				if(numero!=0){
					System.out.println("El numero tiene que ser 0 para que finalice el processo");
				}
      
        	}while(numero!=0);

    	System.out.println("El total de la suma de todos los números introducidos es = " + suma);
	}
}




