public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        //Reemplazar "Mundo" por "a todos"
        var cadenaNueva = cadena.replace("Mundo","a todos");
        System.out.println("cadenaNueva = " + cadenaNueva);

        //Reemplazar "Hola" por "Adios"
        cadenaNueva = cadena.replace("Hola","Saludos");
        System.out.println("cadenaNueva = " + cadenaNueva);

    }
}
