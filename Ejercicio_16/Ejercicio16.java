import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int porrasJugador = 0; // Inicializamos las porras del jugador en 0.
        int porrasOrdenador = 0; // Inicializamos las porras del ordenador en 0.

        while (porrasJugador < 5 && porrasOrdenador < 5) {
            int puntuacionJugador = 0; // Inicializamos la puntuación del jugador en 0.
            int puntuacionOrdenador = 0; // Inicializamos la puntuación del ordenador en 0.
            boolean jugadorTurno = true; // Indica si es el turno del jugador.

 

            while (puntuacionJugador < 11 && puntuacionOrdenador < 11) {
                if (jugadorTurno) {
                    System.out.println("Tu turno. Pulsa Enter para lanzar el dado.");
                    scanner.nextLine();
                    int dado = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6.
                    System.out.println("Obtuviste un " + dado);
                    puntuacionJugador += dado;
                    System.out.println("Tu puntuación actual: " + puntuacionJugador);

                    if (puntuacionJugador == 11) {
                        porrasJugador += 2; // El jugador gana con 11 puntos, suma 2 porras.
                        System.out.println("¡Has ganado! Sumas 2 porras.");
                        break; // Termina el juego.
                    } else if (puntuacionJugador > 11) {
                        System.out.println("Te has pasado de 11. El ordenador gana.");
                        porrasOrdenador++; // El ordenador gana al jugador, suma una porra.
                        break; // Termina el juego.
                    }

                    System.out.println("¿Quieres plantarte (P) o seguir jugando (C)?");
                    String decision = scanner.nextLine();
                    if (decision.equalsIgnoreCase("P")) {
                        jugadorTurno = false; // El jugador decide plantarse, pasa el turno al ordenador.
                    }
                } else {
                    int dado = random.nextInt(6) + 1;
                    System.out.println("El ordenador obtuvo un " + dado);
                    puntuacionOrdenador += dado;
                    System.out.println("Puntuación del ordenador: " + puntuacionOrdenador);

                    if (puntuacionOrdenador >= 11) {
                        if (puntuacionOrdenador == 11) {
                            porrasOrdenador += 2; // El ordenador gana con 11 puntos, suma 2 porras.
                            System.out.println("El ordenador ha ganado con 11 puntos. Suma 2 porras.");
                        } else {
                            System.out.println("El ordenador ha perdido al pasarse de 11. Tú ganas.");
                            porrasJugador++; // El ordenador pierde, suma una porra al jugador.
                        }
                        break; // Termina el juego.
                    }
                }
            }
        }

        if (porrasJugador >= 5) {
            System.out.println("¡Has ganado la partida con " + porrasJugador + " porras!");
        } else {
            System.out.println("El ordenador ha ganado la partida con " + porrasOrdenador + " porras.");
        }
    }
}
