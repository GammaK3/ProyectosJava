import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("***Valor Positivo***");
        var consola = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        var numero = Integer.parseInt(consola.nextLine());

        if (numero > 0){
            System.out.println("Es positivo = " + numero);
        }
        else if (numero<0) {
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es cero: " + numero);
        }
    }
}
