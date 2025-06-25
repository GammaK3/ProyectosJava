public class DiaSemanaExpresiones {
    public static void main(String[] args) {
        System.out.println("*** Dias de la semana con Switch simplificado ***");
        var dia = 19;

        var diaSemana = switch (dia){
            case 1 -> "lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "jueves";
            case 5 -> "Viernes";
            case 6-> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia invalido " + dia;
        };
        System.out.println(diaSemana);
    }
}
