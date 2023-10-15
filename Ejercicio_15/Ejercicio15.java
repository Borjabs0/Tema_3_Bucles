import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int h, m, s = 0;

	System.out.print("Hora (0-23): ");
       	h = Integer.parseInt(scanner.nextLine());
	System.out.print("Minutos (0-59): ");
        m = Integer.parseInt(scanner.nextLine());
	System.out.print("Segundos (0-59): ");
        s = Integer.parseInt(scanner.nextLine());

	boolean horaValida = (h >= 0 && h <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59);
	
	if (horaValida) {
		System.out.println("La hora es válida.");
		System.out.println("Son las " + h + ":" + m + ":" + s);
        } else {
		System.out.println("La hora no es válida.");
        }	
	scanner.close();
	}
}
