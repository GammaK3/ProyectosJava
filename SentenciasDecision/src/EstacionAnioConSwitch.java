import java.util.Scanner;

public class EstacionAnioConSwitch {
    public static void main(String[] args) {
        System.out.println("*** Identifica la estación del año");
        var consola = new Scanner(System.in);

        //Pedimos el mes del año
        System.out.print("Ingrese el mes (entre 1 a 12): ");

        var numeroMes = Integer.parseInt(consola.nextLine());

        var estacion="";
        //Revision del mes usando la sintaxis switch mejorada
        estacion = switch (numeroMes) {
            case 1,2,12-> "Invierno";
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "Verano";
            case 9,10,11 -> "Otoño";
            default -> "Estacion desconocida";
        };
        //Imprimimos resultado
        System.out.printf("La estacion para el mes  %d es %s",numeroMes,estacion);
    }
}
