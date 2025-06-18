public class FormateoDeCadenas {
    public static void main(String[] args) {
        System.out.println("***Formateo de Cadenas***");
        var nombre = "Matías";
        var edad = 35;
        var salario = 21000.50;

        //String.format
        var mensaje = String.format("\nNombre: %s, \nEdad: %d, \nSalario: $%.2f%n",nombre,edad,salario);
        System.out.println(mensaje);

        //Metodo prinf
        System.out.printf("Nombre: %s, Salario: %d, Salario: $%.2f%n",nombre,edad,salario);

        var numeroEmpleado = 12;
        //Formateo con text block
        mensaje = """
                %nDetalle de la persona : \s
                ------------------------
                \tNombre: %s
                \tN°.Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre,numeroEmpleado,edad,salario);
        System.out.println("mensaje = " + mensaje);

        //Formateo con text block y prinfdirectamente
        System.out.printf("""
                %nDetalle de persona\s
                --------------------
                \tNombre: %s
                \tN°.Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """,nombre,numeroEmpleado,edad,salario);


    }
}
