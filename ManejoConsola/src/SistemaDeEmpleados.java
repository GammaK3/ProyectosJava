import java.util.Scanner;

public class SistemaDeEmpleados {
    public static void main(String[] args) {
        System.out.println("****Sistema de empleado****");

        var consola = new Scanner(System.in);

        //Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        //Edad  del Empleado
        System.out.print("Edad del Empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        //Es jefe de Departamento
        System.out.print("Es jefe de departamento (true) or (False) = ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //Imprimir los valores del empleado
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre: "+ nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado);
        //System.out.println("\tSalario: " + salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs jefe de Departamento?: " + esJefeDepartamento);

    }
}
