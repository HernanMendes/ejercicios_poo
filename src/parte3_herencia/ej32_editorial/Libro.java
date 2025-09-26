package parte3_herencia.ej32_editorial;

public class Libro extends Publicacion{
    private int numero_paginas;
    private int anio_publicacion;
    
    public Libro(String titulo, float precio, int numero_paginas, int anio_publicacion){
        super(titulo, precio);
        this.numero_paginas = numero_paginas;
        this.anio_publicacion = anio_publicacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "numero_paginas=" + numero_paginas +
                ", anio_publicacion=" + anio_publicacion +
                "} " + super.toString();
    }
}
