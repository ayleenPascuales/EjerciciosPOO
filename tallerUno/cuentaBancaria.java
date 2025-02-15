package tallerUno;

public class cuentaBancaria {
    String numCuenta;
    int saldo;
    String tipoCuenta;

    public cuentaBancaria(String numCuenta, String tipoCuenta) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public cuentaBancaria(String numCuenta, String tipoCuenta, int saldo) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String toString() {
        return "Cuenta bancaria { Numero de cuenta: " + numCuenta +
                ", Saldo: " + saldo + ", Tipo de cuenta: " +
                tipoCuenta + "}";
    }
}
