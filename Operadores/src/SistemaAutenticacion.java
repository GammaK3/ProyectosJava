import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("***Sistema Autenticación***");

        final var USUARIO = "Admin";
        final var CONTRASENIA = "1234";

        System.out.print("Ingrese su usuario: ");
        var usuar = consola.nextLine();
        System.out.print("Ingrese su Contraseña: ");
        var contra = consola.nextLine();
        var datosCorrectos = USUARIO.equals(usuar) && CONTRASENIA.equals(contra);
        System.out.println("Datos son Correctos = " + datosCorrectos);
    }
}
