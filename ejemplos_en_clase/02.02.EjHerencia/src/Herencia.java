
public class Herencia {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan Pérez", "Ingeniería Informática");
        Admin xAd = new Admin("Pepe Veni", "Cntabilidd", 45);
        System.out.println("Nombre: " + estudiante.getNombre()); // Imprime "Nombre: Juan Pérez"
        System.out.println("Carrera: " + estudiante.getCarrera()); // Imprime "Carrera: Ingeniería Informática"


        System.out.println("Nombre: " + xAd.getNombre()); // Imprime "Nombre: Juan Pérez"
        System.out.println("Carrera: " + xAd.getArea()); // Imprime "Carrera: Ingeniería Informática"
        System.out.println("edad: " + xAd.getEdad());

    }

}


