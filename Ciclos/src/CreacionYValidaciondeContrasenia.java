import java.util.Scanner;

public class CreacionYValidaciondeContrasenia {
    public static void main(String[] args) {
        System.out.println("*** Sistema de creacion y validacion de contraseña ***");
        //Definimos variables y clases a usar
        var consola = new Scanner(System.in);
        var contrasenia = "";
        //Validamos el requisito de tener 6 caracteres minimos
        while (contrasenia.length()<6){
            System.out.print("Ingrese su nueva contraseña: ");
            contrasenia = consola.nextLine();
            if (contrasenia.length()==6){
                System.out.println("Password valida.");
            }
            else System.out.println("Su contraseña de tener al menos 6 caracteres: ");
        }
    }
}
