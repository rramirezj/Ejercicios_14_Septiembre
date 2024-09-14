package agenda; // Declaramos el paquete "agenda"

import java.util.Scanner; // Se importa la clase Scanner para poder leer lo que escribe el usuario

//Definimos la clase "Main" que contiene el método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se crea un nuevo objeto Scanner para leer lo que escribe el usuario
        AgendaReuniones agenda = new AgendaReuniones(); // Se crea un nuevo un objeto AgendaReuniones

        // Bucle para mostrar el menú y procesar las opciones del usuario
        while (true) {
            // Muestra el menú de opciones
            System.out.println("\n1. Crear reunión");
            System.out.println("2. Agregar participante a reunión");
            System.out.println("3. Mostrar reuniones");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario
            scanner.nextLine(); // Lee y descarta la nueva línea pendiente del buffer de entrada

            // Procesa la opción seleccionada
            if (opcion == 1) {
                // Crea una nueva reunión
                System.out.print("Título de la reunión: ");
                String titulo = scanner.nextLine(); // Lee el título de la reunión
                System.out.print("Fecha de la reunión (dd/mm/yyyy): ");
                String fecha = scanner.nextLine(); // Lee la fecha de la reunión
                System.out.print("Hora de la reunión (hh:mm): ");
                String hora = scanner.nextLine(); // Lee la hora de la reunión
                agenda.crearReunion(titulo, fecha, hora); // Crea la reunión
                
            } else if (opcion == 2) {
                // Agrega un participante a una reunión
                System.out.print("Título de la reunión: ");
                String titulo = scanner.nextLine(); // Lee el título de la reunión
                System.out.print("Nombre del participante: ");
                String participante = scanner.nextLine(); // Lee el nombre del participante
                agenda.agregarParticipanteAReunion(titulo, participante); // Añade el participante a la reunión
                
            } else if (opcion == 3) {
                // Muestra todas las reuniones
                agenda.mostrarReuniones(); // Muestra las reuniones
                
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
