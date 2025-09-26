package parte3_herencia.ej31_persona;

public class Empleado extends Persona {
    private String sector;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, String sector, double sueldo){
        super(nombre, apellido, edad);
        this.sector = sector;
        this.sueldo = sueldo;
    }

    public String getSector(){
        return this.sector;
    }
    public double getSueldo(){
        return this.sueldo;
    }

    public void setSector(String sector){
        this.sector = sector;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return String.format("%s %s, %d años - %s, $%.02f", 
            this.getNombre(), this.getApellido(), this.getEdad(),
            this.sector, this.sueldo
        );
    }
    
}
