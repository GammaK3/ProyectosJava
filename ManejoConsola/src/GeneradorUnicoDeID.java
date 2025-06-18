import java.util.Random;
import java.util.Scanner;

public class GeneradorUnicoDeID {
    public static void main(String[] args) {
        var random = new Random();
        var consola = new Scanner(System.in);
        var builder = new StringBuilder();
        System.out.println("***Generador de ID Empleados***");
        System.out.print("Ingrese su Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingrese su apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingrese su año de nacimiento: ");
        var anioNacimiento = consola.nextLine();
        var numeroAleatorio = random.nextInt(9999)+1;
        //var idUnico = builder
                //.append(nombre.substring(0,2).toUpperCase())
                //.append(apellido.substring(0,2).toUpperCase())
                //.append(anioNacimiento.substring(2,4))
                //.append(numeroAleatorio);
        var numeroAleatorioFormateado = String.format("%04d", numeroAleatorio);
        var idUnico = builder
            .append(nombre.substring(0,2).toUpperCase())
            .append(apellido.substring(0,2).toUpperCase())
            .append(anioNacimiento.substring(2))
            .append(numeroAleatorioFormateado);
        System.out.printf("""
                \nNombre: %s
                Apellido: %s
                Año de Nacimiento: %s
                Aleatorio: %s
                ID Único: %s
                """,nombre,apellido,anioNacimiento,numeroAleatorioFormateado,idUnico);



    }
}
