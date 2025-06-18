import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("***Sistema Prestamo Libro***");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿cuentas con credencial de estudiante? (true / false): ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A cuantos KM vives de la biblioteca? : ");
        var distanciaBibliotecaKM = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo =
                tienesCredencial || distanciaBibliotecaKM <= DISTANCIA_PERMITIDA_KM;
        System.out.println("Eres elegible para prestamo de libros: " + esElegiblePrestamo);

    }
}
