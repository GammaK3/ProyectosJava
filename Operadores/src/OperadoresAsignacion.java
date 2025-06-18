public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("***Operadores de Asignacion");
        //Asignacion =
        var miNumero=10;
        int miNumero2;
        miNumero2=2;
        //Aisgnacion compuesto
        //+=
        miNumero += 5;//miNumero = miNumero + 5 ->15
        System.out.println("miNumero = " + miNumero);
        //-=, *=, /= y %=
        miNumero*= 2;//miNumero = miNumero * 2 -> 30
        System.out.println("miNumero = " + miNumero);
        //Asignacion de Variables multiples
        int a = 10, b= 15 , c = 20;
        System.out.printf("a = %d, b = %d, c = %d",a ,b ,c);
    }
}