package cajero; // Declara el paquete

public class Cuenta {
    private double saldo; // Saldo de la cuenta

    // Constructor de la clase Cuenta
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial; // Inicializa el saldo de la cuenta
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo; // Devuelve el saldo actual
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        saldo += cantidad; // Añade la cantidad al saldo
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad <= saldo) { // Verifica si hay suficiente saldo
            saldo -= cantidad; // Resta la cantidad del saldo
        } else {
            throw new IllegalArgumentException("Fondos insuficientes"); // Lanza una excepción si no hay suficiente saldo
        }
    }
}
