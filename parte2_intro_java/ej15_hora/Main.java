package parte2_intro_java.Ej15_Hora;

public class Main {
    public static void main(String[] args) {
        Hora hora1 = new Hora(1, 4, 5);
        Hora hora2 = new Hora(30, 4, 61);
        Hora hora3 = new Hora();

        hora3 = hora1.suma(hora2);
        System.out.println(hora3);
    }
}
