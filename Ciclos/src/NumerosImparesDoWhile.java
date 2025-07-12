public class NumerosImparesDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Numeros impares del 0 al 20 ");
        var contador = 0;
        do {
            //Revisamos si es impar
            if (contador % 2 != 0)
            System.out.print(contador + " ");
            contador++;
        }while (contador<20);
    }
}
