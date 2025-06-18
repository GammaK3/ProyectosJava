public class DetalleProducto {
    public static void main(String[] args) {
        //Detalle de producto
        System.out.println("***Tienda en Linea (Detalle producto)***");
        var nombreProducto = "Sapolio";
        var precio = 3.95;
        var cantidadDisponible = 54;
        var disponible = true;
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponible = " + disponible);
        //Modificar Valores
        nombreProducto = "Sapolio ultra max";
        precio = 4.99;
        cantidadDisponible = 0;
        disponible = false;
        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponible = " + disponible);

    }
}
