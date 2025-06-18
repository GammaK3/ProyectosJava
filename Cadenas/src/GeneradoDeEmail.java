public class GeneradoDeEmail {
    public static void main(String[] args) {
        System.out.println("**** Ejercicio Generador de Email ***");
        var nombre = " Ubaldo Acosta Soto ";
        var empresa = " Global Mentoring ";
        var dominio = ".com.mx";

        //Resultado final = ubaldo.costa.soto@globalmentoring.com.mx
        var Gmail = new StringBuilder();
        Gmail.append(nombre.strip().toLowerCase().replace(" ","."));
        Gmail.append("@").append(empresa.strip().replace(" ",".").toLowerCase());
        Gmail.append(dominio);
        System.out.println("Gmail = " + Gmail);
    }
}
