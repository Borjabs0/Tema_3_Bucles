import java.util.Random;
public class Ejercicio13{
	public static void main(String[] args){
		Random random = new Random();
		final int Cara = 0;
		final int Cruz = 1;
		int aleatorio;
		int numCaras = 0;
		int numCruces = 0;
		double porcentajeCaras;
		double porcentajeCruces;
		for (int i = 0; i < 1_000_000; i++){
			aleatorio = random.nextInt(2);
			switch (aleatorio){
				case Cara:
					numCaras++;
					break;
				case Cruz:
					numCruces++;
					break;
			}
		}
		porcentajeCaras = ((double)numCaras / (numCaras + numCruces)) * 100;
		porcentajeCruces = ((double)numCruces / (numCaras + numCruces)) * 100;
		System.out.println("Caras = " + porcentajeCaras + "%");
		System.out.println("Cruces = " + porcentajeCruces + "%");
	}
}