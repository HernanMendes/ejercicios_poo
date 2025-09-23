package parte2_intro_java.ej17_punto;

public class Punto {
    private float x;
    private float y;

    public Punto(){}
    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return this.x;
    }
    public float getY(){
        return  this.y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setCoord(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Punto sumar(Punto p1){
        return new Punto(
            this.x + p1.x,
            this.y + p1.y
        );
    }

    // TODO: investigar método equals()
    // public boolean esIgual(Punto p1){
    //     if (this.x == p1.x && this.y == p1.y){
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // Mejor forma:
    public boolean esIgual(Punto p1){
        return this.x == p1.x && this.y == p1.y;
    }
    
    @Override
    public String toString(){
        return String.format("(%.02f;%.02f)", x, y);
    }

}
