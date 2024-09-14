package cajero; // Declaramos el paquete "cajero"

import java.util.Scanner; // Se importa la clase Scanner para leer lo que escribe el usuario

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        Cuenta cuenta = new Cuenta(1000); // Crea una cuenta con un saldo inicial de 1000
        CajeroAutomatico cajero = new CajeroAutomatico(cuenta); // Crea un cajero automático asociado a la cuenta

        // Bucle para mostrar el menú y procesar las opciones del usuario
        while (true) {
          
        	// Muestra el menú de opciones
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario
            scanner.nextLine(); // Lee y descarta la nueva línea pendiente del buffer de entrada

            // Procesa la opción seleccionada
            if (opcion == 1) {
                // Consultar saldo
                cajero.mostrarSaldo(); // Muestra el saldo actual
                
            } else if (opcion == 2) {
                // Depositar dinero
                System.out.print("Ingresa la cantidad a depositar: ");
                double cantidad = scanner.nextDouble(); // Lee la cantidad a depositar
                scanner.nextLine(); // Lee y descarta la nueva línea pendiente del buffer de entrada
                cajero.depositarDinero(cantidad); // Deposita el dinero
         
            } else if (opcion == 3) {
                // Retirar dinero
                System.out.print("Ingresa la cantidad a retirar: ");
                double cantidad = scanner.nextDouble(); // Lee la cantidad a retirar
                scanner.nextLine(); // Lee y descarta la nueva línea pendiente del buffer de entrada
                cajero.retirarDinero(cantidad); // Retira el dinero
        
            } else if (opcion == 4) {
                // Salir del programa
                System.out.println("¡Adiós!");
                scanner.close(); // Cierra el objeto Scanner
                break; // Sale del bucle
           
            } else {
                // Opción no válida
                System.out.println("Opción no válida.");
            }
        }
    }
}
