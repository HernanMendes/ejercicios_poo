public class Lamparita{
    private boolean encendida;

    public Lamparita(){
        this.encendida = false;
    }
    public void encender(){
        this.encendida = true;
    }
    public void apagar(){
        this.encendida = false;
    }
     public void toggle() {
        this.encendida = !this.encendida;
    }

    public boolean isEncendida() {
        return this.encendida;
    }

    @Override   // <- Esto en Java se llama 'anotacion' y son mensajes para el compilador o framework. No funciona como los decoradores de Python
    public String toString() {
        return encendida ? "La lamparita está encendida" : "La lamparita está apagada";
    }
}