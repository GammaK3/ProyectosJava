import java.util.Scanner;

public class IdentificaEstacionDelAnio {
    public static void main(String[] args) {
        System.out.println("*** Identifica la estación del año");
        var consola = new Scanner(System.in);

        //Pedimos el mes del año
        System.out.print("Ingrese el mes (entre 1 a 12): ");
        var numeroMes = Integer.parseInt(consola.nextLine());
        var estacion="";
        if (numeroMes == 1 || numeroMes == 2 || numeroMes == 12){
            estacion = "Invierno";
        } else if (numeroMes>=3 && numeroMes<=5) {
            estacion = "Primavera";
        } else if (numeroMes>=6 && numeroMes<=8){
            estacion ="Verano";
        } else if (numeroMes>=9 && numeroMes<=11) {
            estacion ="Otoño";
        }else {
            estacion = "Estacion desconocida";}

        //Imprimimos resultado
        System.out.printf("La estacion para el mes  %d es %s",numeroMes,estacion);
    }
}
