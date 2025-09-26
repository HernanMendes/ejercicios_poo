package parte3_herencia.ej32_editorial;

public class Publicacion {
    private String titulo;
    private float precio;

    public Publicacion(String titulo, float precio){
        this.titulo = titulo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", precio=" + precio + '}';
    }
}
