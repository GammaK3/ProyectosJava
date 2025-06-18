import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("***Generación Ticket de venta***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio Lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)?: ");
        var descuentoPorcentaje =  Integer.parseInt(consola.nextLine());

        //Calculo subtotal sin impuestos
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        //Aplicar descuento
        var descuento = subtotal * (descuentoPorcentaje/100.0);

        //Subtotal con descuento
        var subtotalDescuento = subtotal-descuento;

        //Calculo con impuestos (16%)
        var impuesto = subtotalDescuento * 0.16;

        //Cálculo total de la compra con impuestos
        var costoTotalCompra = subtotalDescuento + impuesto;

        //Imprimir ticket de venta
        System.out.printf("""
                %nTicket de Venta
                ----------------
                Subtotal: $%.2f
                Descuento: $%.2f (%%%d)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """,subtotal,descuento,descuentoPorcentaje,impuesto,costoTotalCompra);

    }
}
