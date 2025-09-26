package parte2_intro_java.ej16_empleado;

public class Empleado {
    private int numero;
    private String nombre;

    public Empleado(){}

    public Empleado(int numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero(){
        return this.numero;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNumero(int num){
        this.numero = num;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }

    @Override
    public String toString(){
        return String.format("Id empleado: %d - Nombre: %s", numero, nombre);
    }
}
