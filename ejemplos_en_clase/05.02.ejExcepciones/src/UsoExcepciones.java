public class UsoExcepciones {
    public static void main(String[] args) {
        try {
            lanzarExcepcion();
        } catch (Exception excepcion) {
            System.out.println("La excepcion se manejo en el main");
        }
        noLanzaExcepcion();
    }

    public static void lanzarExcepcion() throws Exception {
        try {
            System.out.println("1.El metodo lanzarException");
            throw new Exception();
        } catch (Exception excepcion) {
            System.out.println("2.La excepcion se manejo en el metodo lanzarExcepcion");
        }
    }

    public static void noLanzaExcepcion() {
        try {
            System.out.println("3.El metodo noLanzaExacpcion");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}