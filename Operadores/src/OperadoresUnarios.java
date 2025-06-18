public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios***");
        int a = 3, b = -2, resultado;
        var c = true;
        //Operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);
        //Operador Unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);
        //Operadores unarios de incremento y decremento
        //Pre-incremento
        a = 3;
        resultado = ++a;//Primero se incrementa el valor
        //Post-Incremento
        a = 3;
        resultado = a++;//Primero se usa el valor y luego se incrementa;
        System.out.println("resultado a++ = " + resultado);
        System.out.println("A este momento a se incrementa = " + a);
        //Pre-decremento
        b = -2;
        resultado = --b;//Primero se incrementa y despues se usa el valor;
        System.out.println("resultado --b (b ya se decremento) = " + resultado);
        //Post-decremento
        b = -2;
        resultado = b--;//Primero se usa el valor y despues se decrementa,
        System.out.println("resultado b--= " + resultado);
        System.out.println("b en este momento se decrementa = " + b);
        
    }
}
