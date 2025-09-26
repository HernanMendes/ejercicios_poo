public class Monedero {
    private float saldo;

    public Monedero(float saldoInicial){
        if (saldoInicial > 0){
            this.saldo = saldoInicial;
        }
    }

    public void agregarSaldo(float monto){
        if (monto < 0) {
            return;
        }
        this.saldo += monto;
    }
    public void retirarSaldo(float monto){
        if (monto < 0) {
            return;
        }

        this.saldo -= monto;
        if (this.saldo < 0){
            this.saldo = 0;
        }
    }
    public float consultarSaldo(){
        return this.saldo;
    }
}
