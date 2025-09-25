import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        // Creación de la estructura
        HashMap<String, Integer> map = new HashMap<>();

        // Inserción de elementos
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Banana Verde", 2);
        map.put("Banano Azul", 2);
        map.put("Cherry", 3);

        // Acceso a elementos
        System.out.println("Valor asociado con 'Apple': " + map.get("Apple"));

        // Cambio de tamaño es implícito, se ajusta automáticamente

        // Modificación de un elemento
        map.put("Apple", 10);
        System.out.println("Valor modificado asociado con 'Apple': " + map.get("Apple"));

        // Borrado de un elemento
        map.remove("Banana");
        System.out.println("Elementos después de eliminación: " + map);

        // Listado de elementos
        System.out.println("Elementos del HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
