package parte3_herencia.ej32_editorial;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", 19.99f, 863, 1605);
        Disco disco = new Disco("The Dark Side of the Moon", 14.99f, 42);

        System.out.println(libro);
        System.out.println(disco);
    }
}
