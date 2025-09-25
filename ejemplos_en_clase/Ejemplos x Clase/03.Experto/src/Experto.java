public class Experto {

    public static void main(String[] args) {
        xProducto producto1 = new xProducto("Leche", 200, TipoProducto.ALIMENTACION);
        int cantidad1 = 2;

        xProducto producto2 = new xProducto("Televisor", 1200, TipoProducto.ELECTRONICA);
        int cantidad2 = 1;

        double precioTotal1 = CalculadoraPrecio.calcularPrecioTotal(producto1, cantidad1);
        System.out.println("Precio total producto 1: " + precioTotal1);

        double precioTotal2 = CalculadoraPrecio.calcularPrecioTotal(producto2, cantidad2);
        System.out.println("Precio total producto 2: " + precioTotal2);
    }

}
