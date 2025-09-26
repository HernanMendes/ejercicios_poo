package parte3_herencia.ej31_persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Homero", "Simpson", 40);
        Empleado e1 = new Empleado("Ned", "Flanders", 45, "Ventas", 50000);
        Estudiante s1 = new Estudiante("Bart", "Simpson", 10, "Primaria", 5);

        System.out.println(p1);
        System.out.println(e1);
        System.out.println(s1);
    }
}
