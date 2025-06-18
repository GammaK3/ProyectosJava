public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres especiales
        // \n - Imprimir un salto de linea
        var cadena1 = "Hola\n \tmundo";
        System.out.println("cadena1 = " + cadena1);

        // \t - tabulacion
        var cadena2="\tHola \tMundo";
        System.out.println("cadena2 = " + cadena2);

        // \' - agrega una comilla simple
        var cadena3 = "Hola \' Mundo";
        System.out.println("cadena3 = " + cadena3);

        // \" - agrega una comilla doble
        var cadena4 = "Hola \" Mundo";
        System.out.println("cadena4 = " + cadena4);

        //'\\' - Caracter de diagonal invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);

    }
}
