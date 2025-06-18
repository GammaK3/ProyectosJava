import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al sistema bancario");

        var consola = new Scanner(System.in);

        System.out.print("Deseas salir del sistema (true/false)?: ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        //Verificamos (Aplicando logica inversa)
        if (!salirSistema){
            System.out.println("Continuamos dento del sistema");
        }
        else {
            System.out.println("Saliendo de sistema...");

        }
    }
}
