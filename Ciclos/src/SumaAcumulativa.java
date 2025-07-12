public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        //Iterar valores
        var numero = 0;
        while (numero <= MAXIMO){
            //Imprimis lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " " + numero);

            //Realizar la suma acumulativa
            acumuladorSuma += numero++;   //acumuladorSuma = acumuladorSuma + numero

            //Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("Suma de los primeros "+ MAXIMO+ " numeros: " + acumuladorSuma);
    }
}
