import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false ;
        //Comenzar con la iteracion del menu
        while (!salir){
            System.out.print("""
                    *** Sistema de administracion de cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoje opcion: \s""");
            var opcion = consola.nextInt();
            //Evaluar cada opción
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta... \n");
                case 3 -> {
                    System.out.println("Saliendo de sistema. Hasta pronto");
                    salir=true;
                }
                default -> System.out.println("Opcion invalida... \n");
            }
        }
        System.out.println("Fin del sistema de administracion de cuentas");
    }
}
