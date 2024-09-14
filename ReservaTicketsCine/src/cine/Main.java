package cine; // Declaramos el paquete "cine"

import java.util.Scanner; // Se importa la clase Scanner para leer lo que escribe el usuario

// Se crea la clase "Main" con el método "main"
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer lo que escribe el usuario
        ReservaCine reservaCine = new ReservaCine(); // Se crea un objeto o instancia de "ReservaCine"

        // Bucle infinito para mostrar el menú y procesar las opciones del usuario
        while (true) {
        	
            // Muestra el menú de opciones
            System.out.println("\n1. Agregar película");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Mostrar reservas");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario
            scanner.nextLine(); // Lee y descarta la nueva línea pendiente del buffer de entrada

            // Procesa la opción seleccionada
            if (opcion == 1) {
                // Agregar una nueva película
                System.out.print("Título de la película: ");
                String titulo = scanner.nextLine(); // Lee el título de la película
                reservaCine.agregarPelicula(titulo); // Agrega la película
                
            } else if (opcion == 2) {
                // Reservar un asiento en una película
                System.out.print("Título de la película: ");
                String titulo = scanner.nextLine(); // Lee el título de la película
                System.out.print("Número del asiento: ");
                String asiento = scanner.nextLine(); // Lee el número del asiento
                reservaCine.reservarAsiento(titulo, asiento); // Reserva el asiento
                
            } else if (opcion == 3) {
                // Mostrar todas las reservas
                reservaCine.mostrarReservas(); // Muestra las reservas
                
            } else if (opcion == 4) {
                // Salir del programa
                System.out.println("¡Adiós!");
                scanner.close(); // Cierra el objeto Scanner
                break; // Sale del bucle infinito
                
            } else {
                // Opción no válida
                System.out.println("Opción no válida.");
            }
        }
    }
}
