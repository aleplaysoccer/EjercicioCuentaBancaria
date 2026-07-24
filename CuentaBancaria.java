public class CuentaBancaria{
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Se depositaron $" + monto + " a la cuenta de " + this.titular);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}