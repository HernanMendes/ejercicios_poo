public class CalculadoraPrecio {

    private static final double IVA = 0.21;

    public static double calcularPrecioTotal(xProducto xProducto, int cantidad) {
        double precioBase = xProducto.getPrecio() * cantidad;
        double precioImpuestos = precioBase * IVA;
        double precioTotal = precioBase + precioImpuestos;

        // Regla para productos de alimentación: 10% de descuento
        if (xProducto.getTipo() == TipoProducto.ALIMENTACION) {
            precioTotal *= 0.9;
        }

        // Regla para productos electrónicos: 5% de descuento
        if (xProducto.getTipo() == TipoProducto.ELECTRONICA) {
            precioTotal *= 0.95;
        }

        return precioTotal;
    }

}
