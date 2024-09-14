package cajero; // Declaramos el paquete "cajero"

public class CajeroAutomatico {
	
	// Creamos una variable de instancia llamada "cuenta", que es de tipo Cuenta
	private Cuenta cuenta;

    // Constructor de la clase "CajeroAutomatico"
    public CajeroAutomatico(Cuenta cuenta) {
        this.cuenta = cuenta; // Asocia la cuenta al cajero automático
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + cuenta.consultarSaldo()); // Muestra el saldo actual
    }

    // Método para depositar dinero
    public void depositarDinero(double cantidad) {
        cuenta.depositar(cantidad); // Deposita la cantidad en la cuenta
        System.out.println("Ud. ha depositado: $" + cantidad); // Muestra el mensaje de depósito
    }

    // Método para retirar dinero
    public void retirarDinero(double cantidad) {
        try {
            cuenta.retirar(cantidad); // Intenta retirar la cantidad de la cuenta
            System.out.println("Has retirado: $" + cantidad); // Muestra el mensaje de retiro
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Muestra el mensaje de error si no hay suficiente saldo
        }
    }
}
