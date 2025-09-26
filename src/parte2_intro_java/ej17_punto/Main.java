package parte2_intro_java.ej17_punto;

public class Main {
    public static void main(String[] args){
        Punto p1 = new Punto(45, 10);
        Punto p2 = new Punto(45, 10);
        Punto p3 = new Punto();

        System.out.println(p1.esIgual(p2));

        p2.setY(30);
        p3 = p1.sumar(p2);
        System.out.println(p3);
    }
}
