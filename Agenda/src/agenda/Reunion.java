package agenda; // Declaramos el paqute "agenda"

import java.util.ArrayList; // Se importa la clase ArrayList para manejar listas dinámicas

public class Reunion {
    String titulo; // Título de la reunión
    String fecha; // Fecha de la reunión
    String hora; // Hora de la reunión
    ArrayList<String> participantes; // Lista de participantes

    // Constructor de la clase Reunion
    public Reunion(String titulo, String fecha, String hora) {
        this.titulo = titulo; // Asigna el título de la reunión
        this.fecha = fecha; // Asigna la fecha de la reunión
        this.hora = hora; // Asigna la hora de la reunión
        this.participantes = new ArrayList<>(); // Inicializa la lista de participantes
    }

    // Método para agregar un participante a la reunión
    public void agregarParticipante(String participante) {
        participantes.add(participante); // Añade el participante a la lista
    }

    // Método para representar la reunión como una cadena de texto
    @Override
    public String toString() {
        return "Reunión: " + titulo + "\nFecha: " + fecha + "\nHora: " + hora + "\nParticipantes: " + participantes;
    }
}
