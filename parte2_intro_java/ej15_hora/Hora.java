package parte2_intro_java.Ej15_Hora;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(){
        this(0, 0, 0);
    }
    public Hora(int hora, int minutos, int segundos){
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
        normalizar();
    }

    public int getHora(){return this.hora;}
    public int getMinutos(){return this.minutos;}
    public int getSegundos(){return this.segundos;}

    public void setHora(int hora){this.hora = hora >= 0 ? hora : 0;}
    public void setMinutos(int minutos){this.minutos = minutos >= 0 ? minutos : 0;}
    public void setSegundos(int segundos){this.segundos = segundos >= 0 ? segundos : 0;}

    private void normalizar(){
        if (segundos >= 60){
            minutos += segundos / 60;
            segundos = segundos % 60;
        }
        if (minutos >= 60){
            hora += minutos / 60;
            minutos = minutos % 60;
        }
        if (hora >= 24){
            hora = hora % 24;
        }
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

    // Suma que devuelve un nuevo objeto
    public Hora suma(Hora h){
        return new Hora(
            this.hora + h.hora,
            this.minutos + h.minutos,
            this.segundos + h.segundos
        );
    }

    // Suma in-place (modifica el objeto actual)
    public void sumaInplace(Hora h){
        this.hora += h.hora;
        this.minutos += h.minutos;
        this.segundos += h.segundos;
    }
}
