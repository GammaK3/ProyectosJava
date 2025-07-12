import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Aplicacion de cajero automatico");
         // Definimos variables y creamos la instancia de la clase Scanner
        var consola = new Scanner(System.in);
        var saldo = 1000.0;
        var salir = false;
        var retiro = 0.0;
        var deposito = 0.0;
        //Menu de la aplicacion
        while (!salir){
            System.out.print("""
                    Operaciones que puede realizar:
                    1. Consulta saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoje una opcion :\s\n""");
            var opcion = consola.nextInt();
            //Procesamos cada caso usando switch
            switch (opcion){
                case 1 -> System.out.printf("Su saldo es de: $%.2f%n%n",saldo);
                case 2 -> {
                    System.out.println("Ingrese la cantidad que desee retirar: ");
                    retiro= consola.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor que cero.");
                    }
                    else if (retiro > saldo) {
                        System.out.printf("No cuenta con saldo suficiente. Saldo actual: $%.2f%n",saldo);
                    }
                    else {
                        saldo -= retiro;
                        System.out.printf("%nTu nuevo saldo es de: $%.2f%n",saldo);
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese el monto que desea depositar :");
                    deposito=consola.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo actual: $%.2f%n",saldo);
                }
                case 4 -> salir = true;
                default -> System.out.println("Ingrese una opcion valida :)");
            }
        }
    }
}
