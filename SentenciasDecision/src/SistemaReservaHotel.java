import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de hotel ***");

        //Definimos constantes
        final var CUARTO_SIN_VISTA_MAR = 150.50;
        final var CUARTO_CON_VISTA_MAR = 190.50;

        //Pedimos informacion de usuario
        var consola = new Scanner(System.in);

        System.out.print("¿Cual es su nombre?: ");
        var nombreCliente = consola.nextLine();
        System.out.print("¿Cuantos dias se va a hospedar?: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());
        System.out.print("¿Cuenta con vista al mar? (true/false): ");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());

        //Calculamos el monto total
        var montoTotal = vistaMar ? diasEstadia*CUARTO_SIN_VISTA_MAR : diasEstadia*CUARTO_CON_VISTA_MAR;

        //Mensaje si tiene vista al mar
        var mensajeVistaMar = vistaMar ? "No :(" : "Si :)";

        //Imprimimos el detalle de la reservacion
        System.out.printf("""
                %n------- Detalles de la reservacion -------
                Cliente : %s
                Días de estadía: %d
                Costo total : $%.2f
                Habitacion con vista al mar : %s
                """,nombreCliente,diasEstadia,montoTotal, mensajeVistaMar);
    }
}
