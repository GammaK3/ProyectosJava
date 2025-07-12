public class NumerosParesFor {
    public static void main(String[] args) {
        System.out.println("*** Numeros pares del 0 al 20 usando ciclo for ***");
        for (var contador = 0;contador<=20;contador++){
            if (contador % 2 == 0)
                System.out.print(contador + " ");
        }
    }
}
