public class ArrayExample {
    public static void main(String[] args) {
        // Creación de la estructura
        int[] numbers = new int[5];

        // Inserción de elementos
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Acceso a elementos
        System.out.println("Primer elemento: " + numbers[0]);

        // Cambio de tamaño no es aplicable para arrays

        // Modificación de un elemento
        numbers[0] = 10;
        System.out.println("Primer elemento modificado: " + numbers[0]);

        // Borrado de un elemento no es aplicable para arrays, se puede sobrescribir
        numbers[1] = 0;

        // Listado de elementos
        System.out.print("Elementos del array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
