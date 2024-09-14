package habit; // Declaramos el paquete

public class Habit {
    String name; // Nombre del hábito
    int progress; // Progreso del hábito en días

    // Constructor
    public Habit(String name) {
        this.name = name; // Asigna el nombre del hábito
        this.progress = 0; // Inicializa el progreso a 0
    }

    // Método para actualizar el progreso del hábito
    public void updateProgress(int value) {
        this.progress += value; // Añade el valor al progreso actual
    }

    // Método para representar el hábito como una cadena de texto
    @Override
    public String toString() {
        return name + ": " + progress + " días"; // Devuelve el nombre y el progreso del hábito
    }
}
