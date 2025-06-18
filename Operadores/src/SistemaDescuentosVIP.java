import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("***Sistema descuentos VIP***");
        final var NO_PRODUCTOS_DESCUENTOS = 10;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuantos productos compraste hoy?: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("¿Tienes la membresia de la tienda? (true / false): ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());
        var esElegibleDescuento =
                cantidadProductos >= NO_PRODUCTOS_DESCUENTOS && tienesMembresia;
        System.out.println("Tienes acceso al descuento VIP = " + esElegibleDescuento);

    }

}
