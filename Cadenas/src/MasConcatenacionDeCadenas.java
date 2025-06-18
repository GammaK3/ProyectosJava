public class MasConcatenacionDeCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        //Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando .concat = " + cadena3);

        //StringBuilder
        var constructorDeCadenas = new StringBuilder();
        //constructorDeCadenas.append(cadena1);
        //constructorDeCadenas.append(" ");
        //constructorDeCadenas.append(cadena2);
        constructorDeCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorDeCadenas.toString();
        System.out.println("resultado = " + resultado);

        //StringBuffer Se usa cuando hay ,muchos hilos
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("stringBuffer = " + stringBuffer);

        //join
        resultado = String.join("***",cadena1,cadena2);
        System.out.println("resultado = " + resultado);

    }
}
