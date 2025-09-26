package parte3_herencia.ej32_editorial;

public class Disco extends Publicacion{
    private int duracion_minutos;
    
    public Disco(String titulo, float precio, int duracion_minutos){
        super(titulo, precio);
        this.duracion_minutos = duracion_minutos;
    }

    @Override
    public String toString() {
        return "Disco{" + "duracion_minutos=" + duracion_minutos +
                "} " + super.toString();
    }
}
