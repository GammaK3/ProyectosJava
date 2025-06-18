import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("***Calculo Area y perimetro de un rectangulo***");
        var consola = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese la altura del rectangulo: ");
        var altura = Integer.parseInt(consola.nextLine());
        var area = base*altura;
        var perimetro = 2*(base+altura);
        System.out.printf("""
                \n***Area y altura del rectangulo***
                \nBase = %d metros
                Altura = %d metros
                Area = %d m
                Perimetro = %d metros""",base,altura,area,perimetro);

    }
}
