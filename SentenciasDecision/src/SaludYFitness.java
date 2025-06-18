import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud Y Fitness ***");

         //Constantes
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04; //Valor aproximado, son Kilocalorias

        //Pedimos los valores de usuario
        var consola = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre?: ");
        var nombreUsuario = consola.nextLine();
        System.out.print("¿Cuantos pasos has caminado hoy?: ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        //Verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios>=META_PASOS_DIARIO) ? "Si :)" : "No :(";

        //Calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        //Mostrar la informacion
        System.out.printf("""
                %nUsuario : %s
                Pasos dados : %d
                Caloria quemadas : %.2fkcal
                Meta de pasos diario alcanzada: %s
                ----------------------------------
                La meta de pasos diarios es de : %d
                """,nombreUsuario,pasosDiarios,caloriasQuemadas,metaAlcanzada,META_PASOS_DIARIO);

    }
}
