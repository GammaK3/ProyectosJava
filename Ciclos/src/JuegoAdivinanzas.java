import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego de adivinar el número ***");

        var random = new Random();
        var consola = new Scanner(System.in);

        int numeroSecreto = random.nextInt(50) + 1;
        int intentosMaximos = 5;
        int numeroIngresado;

        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.print("Intento " + intento + " - Adivina el número (1-50): ");
            numeroIngresado = consola.nextInt();

            if (numeroIngresado == numeroSecreto) {
                System.out.println("¡Correcto! El número era " + numeroSecreto + ". Lo lograste en " + intento + " intento(s).");
                return; // Salimos del programa
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("El número ingresado es menor.\n");
            } else {
                System.out.println("El número ingresado es mayor.\n");
            }
        }

        System.out.println("Se acabaron los intentos. El número era: " + numeroSecreto);
    }
}
