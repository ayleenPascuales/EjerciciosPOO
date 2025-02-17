package tallerCinco;

public class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }
}

////////////////////////////////////////////////////
class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
}
