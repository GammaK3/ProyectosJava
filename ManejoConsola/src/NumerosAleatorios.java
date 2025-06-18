import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("***Números aleatorios");
        var random = new Random();

        //Generar un número aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 0 y 9 = " + numeroAleatorio);

        //Generar un numero aleatorio entre 1 y 10
        numeroAleatorio= random.nextInt(10)+1;
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio);

        //Generar numero flotante entre 0.0 y 1.0
        var floanteAleatorio =  random.nextFloat();
        System.out.println("floanteAleatorio = " + floanteAleatorio);

        //Simular el lanzamiento de un dado
        var dado = random.nextInt(6)+1;
        System.out.println("Resultado de lanzar un dado = " + dado);
        

    }
}
