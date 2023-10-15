import java.util.Random;
public class Ejercicio14{
	public static void main(String[] args){
		Random random = new Random();
		final int uno = 0;
		final int dos = 1;
		final int tres = 2;
		final int cuatro = 3;
		final int cinco = 4;
		final int seis = 5;
		int aleatorio;
		int numUnos = 0;
		int numDos = 0;
		int numTres = 0;
		int numCuatro = 0;
		int numCinco = 0;
		int numSeis = 0;
		double porcentajeUnos;
		double porcentajeDos;
		double porcentajeTres;
		double porcentajeCuatro;
		double porcentajeCinco;
		double porcentajeSeis;

		for (int i = 0; i < 1_000_000; i++){
			aleatorio = random.nextInt(6);
			switch (aleatorio){
				case uno:
					numUnos++;
					break;
				case dos:
					numDos++;
					break;
				case tres:
					numTres++;
					break;
				case cuatro:
					numCuatro++;
					break;
				case cinco:
					numCinco++;
					break;
				case seis:
					numSeis++;
					break;
			}
		}

		porcentajeUnos = ((double)numUnos / (numUnos + numDos + numTres + numCuatro + numCinco + numSeis)) * 100;
		porcentajeDos = ((double)numDos / (numDos + numUnos + numTres + numCuatro + numCinco + numSeis)) * 100;
		porcentajeTres = ((double)numTres / (numTres + numUnos + numDos + numCuatro + numCinco + numSeis)) * 100;
		porcentajeCuatro = ((double)numCuatro / (numCuatro + numUnos + numDos + numTres + numCinco + numSeis)) * 100;
		porcentajeCinco = ((double)numCinco / (numCinco + numUnos + numDos + numTres + numCuatro + numSeis)) * 100;
		porcentajeSeis = ((double)numSeis / (numSeis + numUnos + numDos + numTres + numCuatro + numCinco)) * 100;
		
		System.out.println("Numero de Unos = " + numUnos);
		System.out.println("Numero de Doses = " + numDos);
		System.out.println("Numero de Treses = " + numTres);
		System.out.println("Numero de Cuatros = " + numCuatro);
		System.out.println("Numero de Cincos = " + numCinco);
		System.out.println("Numero de Seises = " + numSeis);
	
		System.out.println("");

		System.out.println("Porcentaje Unos = " + porcentajeUnos + "%");
		System.out.println("Portentaje Doses = " + porcentajeDos + "%");
		System.out.println("Porcentaje Treses = " + porcentajeTres + "%");
		System.out.println("Portentaje Cuatros = " + porcentajeCuatro + "%");
		System.out.println("Porcentaje Cincos = " + porcentajeCinco + "%");
		System.out.println("Portentaje Seises = " + porcentajeSeis + "%");
	}
}