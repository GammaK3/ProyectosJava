import java.sql.SQLOutput;
import java.util.Scanner;

public class EjemploClaseDeCocina {
    public static void main(String[] args) {
        System.out.println("***Clases de Cocina***");
        var consola = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        var receta = consola.nextLine();

        System.out.print("Ingrese los ingredientes: ");
        var ingredientes = consola.nextLine();

        System.out.print("Ingresa el tiempo de preparación en minutos: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese la dificultad: ");
        var dificultad = consola.nextLine();

        //Imprimir Datos
        System.out.println("\n---Receta de Cocina---");
        System.out.println("Nombre de receta: "+ receta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad: " + dificultad);

    }
}
