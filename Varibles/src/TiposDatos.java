import javax.lang.model.SourceVersion;

public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de datos
        //Enteros
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShirt = 32000;
        System.out.println("tipoShirt = " + tipoShirt);
        int tipoInt = 214774836;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L;
        System.out.println("tipoLong = " + tipoLong);

        //Punto Flotante (Valor deafult 0.0)
        float tipoFloat = 3.14F;    //F o f para indicar tipo flotante
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D;       //D o d para indicar tipo Double (Opcional)

        //Caracter ('\u0000')
        char tipoChar = 'A';        //Cualquier caracter del juego Unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';

        //Booleano (False)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipos Object o Referencia
        //En una cadena si no se le asigna por default es "null"
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Orion Maquera";
        System.out.println("nombre = " + nombre);


    }
}
