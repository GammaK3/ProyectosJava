public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("***Operadodes de Comparación***");
        int a = 3, b = 2;
        //Igualdad
        var resultado = a==b;
        System.out.println("resultado de igualar si a == b : " + resultado);
        // Operador de Distinto !=
        resultado = a != b;
        System.out.println("resultado a != b : " + resultado);
        //Mayor que
        resultado = a>b;
        System.out.println("resultado a > b : " + resultado);
        //Mayor o igual
        resultado = a>=b;
        System.out.println("resultado a >= b : " + resultado);
        //Menor que
        resultado = a<b;
        System.out.println("resultado a < b : " + resultado);
        //Menor o igual que
        resultado = a<=b;
        System.out.println("resultado a >= b : " + resultado);
    }
}
