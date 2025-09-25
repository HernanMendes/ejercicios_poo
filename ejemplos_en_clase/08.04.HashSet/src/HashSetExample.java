import java.util.HashSet;

 class HashSetExample {
    public static void main(String[] args) {
        // Creación de la estructura
        HashSet<String> set = new HashSet<>();

        // Inserción de elementos
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Cherry");


        // Acceso a elementos
        System.out.println("¿Contiene 'Apple'? " + set.contains("Apple"));

        // Cambio de tamaño es implícito, se ajusta automáticamente

        // Modificación no es aplicable directamente, pero podemos eliminar y agregar
        set.remove("Apple");
        set.add("Avocado");
        System.out.println("¿Contiene 'Avocado'? " + set.contains("Avocado"));

        // Borrado de un elemento
        set.remove("Banana");
        System.out.println("Elementos después de eliminación: " + set);

        // Listado de elementos
        System.out.print("Elementos del HashSet: ");
        for (String fruit : set) {
            System.out.print(fruit + " ");
        }
    }
}
