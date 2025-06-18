public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadenas
        var cadena1="Hola Mundo";

        //Obtener el largo de una cadena
        var longitud= cadena1.length();
        System.out.println("longitud = " + longitud);

        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a mayusculas
        var mayusuculas = cadena1.toUpperCase();
        System.out.println("mayusuculas = " + mayusuculas);

        //Convertir a minusculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        //Eliminar espacios al incio y al final
        var cadena2 = "   Leo Reyes    ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());


    }
}
