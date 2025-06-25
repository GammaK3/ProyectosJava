import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticacion ***");

        //Valores de usuario y contraseña
        final var USER = "admin";
        final var PASSWORD = "1234";

        //Se captura el valor del usuario y contraseña
         var consola = new Scanner(System.in);
        System.out.print("Ingrese el ususario: ");
         var usuario = consola.nextLine().strip().toLowerCase();
        System.out.print("Ingrese la contraseña: ");
        var contrasenia = consola.nextLine().strip().toLowerCase();
         //Validamos los datos e imprimimos los resultados
        String resultado = null;
        if (usuario.equals(USER)){
            resultado = contrasenia.equals(PASSWORD) ?"Bienvenido al Sistema!": "contraseña incorrecta";
        }else if (!usuario.equals(USER)) resultado = "Usuario incorrecto";
        else resultado = "Usuario y contraseña incorrectas";
        System.out.println(resultado);
    }
}
