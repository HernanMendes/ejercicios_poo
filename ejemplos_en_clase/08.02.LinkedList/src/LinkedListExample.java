import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creación de la estructura
        LinkedList<String> list = new LinkedList<>();

        // Inserción de elementos
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Acceso a elementos
        System.out.println("Primer elemento: " + list.get(0));

        // Cambio de tamaño es implícito, se ajusta automáticamente

        // Modificación de un elemento
        list.set(0, "Avocado");
        System.out.println("Primer elemento modificado: " + list.get(0));

        // Borrado de un elemento
        list.remove(1);
        System.out.println("Elementos después de eliminación: " + list);

        // Listado de elementos
        System.out.print("Elementos del LinkedList: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
    }
}
