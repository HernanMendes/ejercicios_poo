public class Admin extends Persona {

    private String Area;
    private int Edad;

    public Admin(String nombre, String area, int edad) {
        super(nombre);
        this.Area = area;
        this.Edad=edad;
    }

    public String getArea() {
        return Area;
    }
    public int getEdad() {
        return Edad;
    }

}
