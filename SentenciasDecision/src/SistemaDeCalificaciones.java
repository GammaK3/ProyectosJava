import java.util.Scanner;

public class SistemaDeCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");

        var consola = new Scanner(System.in);
        //Declaramos variables
        System.out.print("Ingrese su calificacion (0-10): ");
        var calificacion = Double.parseDouble(consola.nextLine());
        var calificacionConvertida ="";

        //Convertimos la calificacion a letras
        if (calificacion>=9 && calificacion<=10){
            calificacionConvertida = "A";
        }else if (calificacion>=8 && calificacion<9) {
            calificacionConvertida = "B";
        }else if (calificacion>=7 && calificacion<8) {
            calificacionConvertida = "C";
        }else if (calificacion>=6 && calificacion<7){
            calificacionConvertida = "D";
        } else if (calificacion>=0 && calificacion<6) {
            calificacionConvertida = "F";
        }else calificacionConvertida = "Valor desconocido";
        //Imprimimos el valor
        if (calificacion<=10 && calificacion>=0){
            System.out.printf("%nSu puntaje es de %.1f, su calificacion es %s%n ",calificacion,calificacionConvertida);
        }
        else System.out.println(calificacionConvertida);
    }
}
