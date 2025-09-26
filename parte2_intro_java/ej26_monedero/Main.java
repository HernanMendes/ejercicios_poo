public class Main {
    public static void main(String[] args) {
        Monedero m1 = new Monedero(100);
        System.out.println("Saldo inicial: " + m1.consultarSaldo());
        m1.agregarSaldo(50);
        System.out.println("Saldo tras agregar 50: " + m1.consultarSaldo());
        m1.retirarSaldo(30);
        System.out.println("Saldo tras retirar 30: " + m1.consultarSaldo());
        m1.retirarSaldo(150);
        System.out.println("Saldo tras retirar 150: " + m1.consultarSaldo());
    }
    
}
