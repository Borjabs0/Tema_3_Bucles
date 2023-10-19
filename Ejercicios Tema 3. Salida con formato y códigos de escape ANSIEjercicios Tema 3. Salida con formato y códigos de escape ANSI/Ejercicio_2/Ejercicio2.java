import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int h, m, s = 0;

	System.out.print("Hora (0-23): ");
       	h = Integer.parseInt(scanner.nextLine());
	System.out.print("Minutos (0-59): ");
        m = Integer.parseInt(scanner.nextLine());
	System.out.print("Segundos (0-59): ");
        s = Integer.parseInt(scanner.nextLine());

	System.out.printf("Son las %02d:%02d:%02d",h ,m , s);
	
	scanner.close();
	}
}