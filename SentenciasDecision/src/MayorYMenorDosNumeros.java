import java.util.Scanner;

public class MayorYMenorDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Mayor y menor de 2 numeros");
        var consola = new Scanner(System.in);

        //Pedimos los 2 numeros
        System.out.print("Ingrese el primer numero: ");
        var primerNumero = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el segundo número: ");
        var segundoNumero = Integer.parseInt(consola.nextLine());

        //Comparamos los numeros
        var numeroMayor = 0;
        var numeroMenor = 0;
        if (primerNumero==segundoNumero){
            System.out.println("Ambos números son iguales "+numeroMayor);
        }
        else if(primerNumero<segundoNumero){
            numeroMayor=segundoNumero;
            numeroMenor=primerNumero;
            System.out.println(numeroMayor + " es mayor que " + numeroMenor);
        }
        else {
            numeroMayor=primerNumero;
            numeroMenor=segundoNumero;
            System.out.println(numeroMayor + " es mayor que " + numeroMenor);
        }

    }
}
