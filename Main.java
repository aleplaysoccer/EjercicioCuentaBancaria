public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Erwin Tomás", "123456789", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("Antonio Molina", "987654321", 500.0);

        System.out.println("Pruebas de la Cuenta 1");
        cuenta1.depositar(250.0);

        double montoRetiro1 = 1500.0;
        if (cuenta1.retirar(montoRetiro1)) {
            System.out.println("Retiro exitoso de $" + montoRetiro1);
        } else {
            System.out.println("Transacción denegada: Fondos insuficientes para retirar $" + montoRetiro1);
        }

        System.out.println("Pruebas de la Cuenta 2");
        double montoRetiro2 = 100.0;
        if (cuenta2.retirar(montoRetiro2)) {
            System.out.println("Retiro exitoso de $" + montoRetiro2);
        } else {
            System.out.println("Transacción denegada: Fondos insuficientes para retirar $" + montoRetiro2);
        }

        System.out.println("Bucle de transacciones");
        double[] transacciones = {50.0, 100.0, 20.0};
        
        for (int i = 0; i < transacciones.length; i++) {
            System.out.println("Transacción #" + (i + 1) + ":");
            cuenta1.depositar(transacciones[i]);
        }

        System.out.println("Saldos Finales");
        System.out.println("Saldo final de Erwin Tomás: $" + cuenta1.consultarSaldo());
        System.out.println("Saldo final de Antonio Molina: $" + cuenta2.consultarSaldo());
    }
}
