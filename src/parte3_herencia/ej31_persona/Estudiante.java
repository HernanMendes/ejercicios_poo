package parte3_herencia.ej31_persona;

public class Estudiante extends Persona {
    private String carrera;
    private int anioCursado;

    public Estudiante(String nombre, String apellido, int edad, String carrera, int anioCursado){
        super(nombre, apellido, edad);
        this.carrera = carrera;
        this.anioCursado = anioCursado;
    }

    public String getCarrera(){
        return this.carrera;
    }
    public int getAnioCursado(){
        return this.anioCursado;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setAnioCursado(int anioCursado){
        this.anioCursado = anioCursado;
    }

    @Override
    public String toString(){
        return String.format("%s %s, %d años - %s, año %d", 
            this.getNombre(), this.getApellido(), this.getEdad(),
            this.carrera, this.anioCursado
        );
    }
}
