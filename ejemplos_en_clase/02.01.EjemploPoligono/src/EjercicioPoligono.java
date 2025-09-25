
abstract class Poligono {
    public String color;
    public long altura;
    public long base;
    abstract long area();
    abstract void pintar(String color);
}

class Rectangulo extends Poligono {
    public Rectangulo( long x, long y) {
        altura = x;
        base = y;
    }

    public void pintar( String color) {
        System.out.println("Rectangulo color " + color);
    }

    public long area() {
        return base * altura;
    }
}

class Cuadrado extends Poligono{
    public Cuadrado (long x) {
        base = x;
        altura = x;
    }

    public void pintar( String color) {
        System.out.println("cuadrado color " + color);
    }

    public long area() {
        return base * altura;
    }
}

public class  EjercicioPoligono {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(10, 5);
        pintarObjeto(rect, "Rojo");
        Cuadrado cuad = new Cuadrado(4);
        long i = areaObjeto(cuad);
        System.out.println("El area del cuadrado es " + i);

    }

    public static void pintarObjeto(Poligono p, String c) {
        p.pintar(c);
    }

    public static long areaObjeto(Poligono p) {
        return p.area();
    }

}