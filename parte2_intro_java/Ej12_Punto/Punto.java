package parte2_intro_java.Ej12_Punto;

public class Punto {
    public int x;
    public int y;
    
    public Punto(int a, int b) {
        x = a; 
        y = b;
    }
    public Punto(int z) {
        this(z, z);
    }
}
