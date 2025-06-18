public class TipoVar {
    public static void main(String[] args) {
        System.out.println("***Uso de Var en Java***");
        //Sin el uso de var
        String nombre = "Orion";
        System.out.println("nombre = " + nombre);

        //Con el uso de VAR
        var nombre2 = "Pepe";
        System.out.println("nombre2 = " + nombre2);

        //Definir otras variables
        var edad = 30;//Se infiere tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; //Se infiere tipo float
        var esCasado = false; //Se infiere tipo boolean
        esCasado = true;

        //Se debe definir un valor
        //var precio; esto lanza error

        //Se debe inferir el tipo de dato
        //var apellido = null;  No es un tipo de dato inferible
    }
}
