//import java.util.Scanner;

//public class SistemaTiendaEnLinea {
//    public static void main(String[] args) {
//        System.out.println("*** Tienda en linea con descuentos ***");
//        var consola = new Scanner(System.in);
//        //Condiciones
//        final var MONTO_COMPRA_DESC = 1000;

//        System.out.print("¿Cual fue el monto de tu compra?: ");
//        var montoSinDescuento = Integer.parseInt(consola.nextLine());

//        System.out.print("¿Eres miembro de la tienda? (true/false): ");
//        var esMiembro = Boolean.parseBoolean(consola.nextLine());

//        if (montoSinDescuento>MONTO_COMPRA_DESC&&esMiembro==true){
//            var descuento = 0.1;
//            var montoDelDescuento = descuento*montoSinDescuento;
//            var montoFinal = montoSinDescuento+montoDelDescuento;
//            System.out.printf("""
//                \nFelicidades ha obtenido un descuento del %.0f%%
//                Monto de la compra: $%d
//                Monto del descuento: $%.2f
//                Monto final de la compra con descuento: $%.2f
//                """,descuento*100,montoSinDescuento,montoDelDescuento,montoFinal);}

//        else if (montoSinDescuento>MONTO_COMPRA_DESC){
//            var descuento = 0.05;
//            var montoDelDescuento = descuento*montoSinDescuento;
//            var montoFinal = montoSinDescuento+montoDelDescuento;
//            System.out.printf("""
//                %nFelicidades ha obtenido un descuento del %.0f%%
//                Monto de la compra: $%d
//                Monto del descuento: $%.2f
//                Monto final de la compra con descuento: $%.2f
//                """,descuento*100,montoSinDescuento,montoDelDescuento,montoFinal);}

//        else{
//            var descuento = 0;
//            var montoConDescuento = montoSinDescuento;
//            System.out.printf("""
//                \nNo obtuviste ningún tipo de descuento
//                Te invitamos a hacerte miembro de la tienda
//                Monto final de la compra: $%d
//                """,montoSinDescuento);
//        }
//        }
//    }
import java.util.Scanner;

public class SistemaTiendaEnLinea {
    public static void main(String[] args) {
        final int MONTO_MINIMO_DESC = 1000;
        final double DESCUENTO_MIEMBRO = 0.10;
        final double DESCUENTO_GENERAL = 0.05;

        Scanner consola = new Scanner(System.in);

        System.out.println("*** Tienda en línea con descuentos ***");

        // Entrada de datos
        System.out.print("¿Cuál fue el monto de tu compra?: ");
        int monto = Integer.parseInt(consola.nextLine());

        System.out.print("¿Eres miembro de la tienda? (true/false): ");
        boolean esMiembro = Boolean.parseBoolean(consola.nextLine());

        // Lógica del descuento
        double descuento = 0;
        if (monto > MONTO_MINIMO_DESC) {
            if (esMiembro) {
                descuento = DESCUENTO_MIEMBRO;
            } else {
                descuento = DESCUENTO_GENERAL;
            }
        }

        double montoDelDescuento = monto * descuento;
        double montoFinal = monto - montoDelDescuento;

        // Salida de resultados
        if (descuento > 0) {
            System.out.printf("""
                \nFelicidades, has obtenido un descuento del %.0f%%!
                Monto de la compra: $%d
                Monto del descuento: $%.2f
                Monto final de la compra con descuento: $%.2f
                """, descuento * 100, monto, montoDelDescuento, montoFinal);
        } else {
            System.out.printf("""
                \nNo obtuviste ningún descuento.
                Te invitamos a hacerte miembro de la tienda.
                Monto final de la compra: $%d
                """, monto);
        }

        consola.close(); // Cierra el Scanner
    }
}

