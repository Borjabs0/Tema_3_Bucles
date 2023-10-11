import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int numero;
	int suma = 0;
	int contador = 0;
	double media = 0;
		do{
			System.out.print("Ingrese un número: ");
        		numero = scanner.nextInt();
			suma += numero; 
			contador = contador + 1; 
			media = (double) (suma/contador);

				if(numero>0){
					System.out.println("El numero tiene que ser negativo para que finalice el processo");
				}
      
        	}while(numero>0);

    	System.out.println("La media es = " + media);
	}
}


