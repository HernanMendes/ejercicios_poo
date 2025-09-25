public class xProducto {

    private String nombre;
    private double precio;
    private TipoProducto tipo;

    public xProducto(String nombre, double precio, TipoProducto tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

}
