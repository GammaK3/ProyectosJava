import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro Rango ***");
        //Definimos los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;
        //Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un valor entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //Verificar si el dato esta dentro de un rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("¿esta Dentro Rango? = " + estaDentroRango);

    }
}
