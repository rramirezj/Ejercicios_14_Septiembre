package habit; // Declara el paquete

import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class HabitTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        ArrayList<Habit> habits = new ArrayList<>(); // Crea una lista para almacenar los hábitos

        // Bucle infinito para mostrar el menú y procesar las opciones del usuario
        while (true) {
            // Muestra el menú de opciones
            System.out.println("\n1. Agregar hábito");
            System.out.println("2. Actualizar progreso");
            System.out.println("3. Mostrar resumen");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int option = scanner.nextInt(); // Lee la opción seleccionada por el usuario
            scanner.nextLine(); // Consume la nueva línea

            // Procesa la opción seleccionada
            if (option == 1) {
                // Agregar un nuevo hábito
                System.out.print("Nombre del hábito: ");
                String name = scanner.nextLine(); // Lee el nombre del hábito
                habits.add(new Habit(name)); // Añade el nuevo hábito a la lista
            } else if (option == 2) {
                // Actualizar el progreso de un hábito
                System.out.print("Nombre del hábito: ");
                String name = scanner.nextLine(); // Lee el nombre del hábito
                for (Habit habit : habits) { // Recorre la lista de hábitos
                    if (habit.name.equals(name)) { // Busca el hábito por nombre
                        System.out.print("Progreso a añadir: ");
                        int progress = scanner.nextInt(); // Lee el progreso a añadir
                        scanner.nextLine(); // Consume la nueva línea
                        habit.updateProgress(progress); // Actualiza el progreso del hábito
                        break; // Sale del bucle una vez encontrado el hábito
                    }
                }
            } else if (option == 3) {
                // Mostrar el resumen de hábitos
                System.out.println("\nResumen de hábitos:");
                for (Habit habit : habits) { // Recorre la lista de hábitos
                    System.out.println(habit); // Muestra cada hábito
                }
            } else if (option == 4) {
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
