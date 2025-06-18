import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        //Leer tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        //Leer un tipo double
        System.out.print("Ingrese su altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        //Consumimos el caracter de salto de linea
        consola.nextLine();
        //Leer tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        //No se que es XD
        //System.out.println("Tu nombre es: "+ consola.nextLine());


        //Conversion de datos
        System.out.println("Proporciona valor entero: ");
       // var enteroString = consola.nextLine();
       // var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        //Tipo flotante
        System.out.println("Proporciona un valor tipo Flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        //Double.parseDouble()
        //Booolean.parseBoolean()






    }
}
