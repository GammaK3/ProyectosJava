import java.util.Scanner;

public class SistemaDeEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de envios ***");
        //Declaramos los precios constantes
        final var PRECIO_NACIONAL = 10.0;
        final var PRECIO_INTERNACIONAL = 20.0;

        //Solicitamos los datos destino y peso
        var consola = new Scanner(System.in);

        System.out.print("Ingrese su destino (internacional o nacional): ");
        var destino = consola.nextLine().strip().toUpperCase();

        System.out.print("Ingrese el peso de su equipaje Kg: ");
        var peso = Double.parseDouble(consola.nextLine());

        //Sacamos el costo de envio y lo imprimimos en pantalla
        //ar costoDeEnvio = 0.0;
        //if (destino.equals("INTERNACIONAL") || destino.equals("NACIONAL")){
        //costoDeEnvio = destino.equals("INTERNACIONAL") ? peso*PRECIO_INTERNACIONAL : peso*PRECIO_NACIONAL;
        //    System.out.printf("%nEl costo de envio de su paquete es de: $%.2f%n",costoDeEnvio);
        //}else System.out.println("Verfique si los valores son correctos");
        //Calculo de envio de paquete
        Double costoEnvio = switch (destino){
            case "NACIONAL" -> peso*PRECIO_NACIONAL;
            case  "INTERNACIONAL" -> peso*PRECIO_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido.Ingresa Nacional o internacional");
                yield null;
            }
        };
        //Mostramos costo de envio
        if (costoEnvio != null)
            System.out.printf("El costo de envio de su paquete es: $%.2f",costoEnvio);
    }
}
