import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {
        System.out.println("*** Cacculadora de java ***");
        // Definimos variables y creamos la instancia de la clase Scanner
        var consola = new Scanner(System.in);
        var valor1 = 0.0;
        var valor2 = 0.0;
        var resultado = 0.0;
        var opcion = 0;
        var salir = false ;
        //Menu de la aplicacion
        do {
            System.out.print("""
                    \nOperaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Escoja una opcion:\s
                    """);
            opcion=consola.nextInt();
            //Damos valor a las variables
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Dame el valor 1: ");
                valor1 = consola.nextDouble();

                System.out.print("Dame el valor 2: ");
                valor2 = consola.nextDouble();
            }
            switch (opcion){
                case 1 -> {
                    resultado=valor1+valor2;
                    System.out.printf("Resultado de la suma: %.2f%n",resultado);
                }
                case 2 -> {
                    resultado=valor1-valor2;
                    System.out.printf("Resultado de la resta: %.2f%n",resultado);
                }
                case 3 -> {
                    resultado=valor1*valor2;
                    System.out.printf("Resultado de la multiplicación: %.2f%n",resultado);
                }
                case 4 -> {
                    if (valor2==0) System.out.println("ERROR. No se puede dividir entre cero%n");
                    else {
                        resultado = valor1 / valor2;
                        System.out.printf("Resultado de la division: %.2f%n", resultado);
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del programa de calculadoraaaaaa");
                    salir=true;
                }
                default -> System.out.println("Ingrese una opcion correcta\n");
            }
        }while (!salir);
    }
}
