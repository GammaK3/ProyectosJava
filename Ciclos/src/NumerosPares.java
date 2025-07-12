public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("***Numeros pares del 1 al 20 ***");
        var contador = 1;
        while (contador<=20){
            // Revisamos si es un numero par
            if (contador % 2 == 0)
                System.out.print(" " + contador);
            contador++;
        }
    }
}
