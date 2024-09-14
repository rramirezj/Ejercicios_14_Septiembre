package agenda; // Declaramos el paquete "agenda"

import java.util.ArrayList; // Se importa la clase ArrayList para manejar listas dinámicas

public class AgendaReuniones {
    ArrayList<Reunion> reuniones; // Lista de reuniones

    // Constructor de la clase AgendaReuniones
    public AgendaReuniones() {
        this.reuniones = new ArrayList<>(); // Inicializa la lista de reuniones
    }

    // Método que crea una nueva reunión
    public void crearReunion(String titulo, String fecha, String hora) {
        Reunion reunion = new Reunion(titulo, fecha, hora); // Crea una nueva reunión
        reuniones.add(reunion); // Añade la reunión a la lista
    }

    // Método para agregar un participante a una reunión
    public void agregarParticipanteAReunion(String titulo, String participante) {
        for (Reunion reunion : reuniones) { // Recorre la lista de reuniones
            if (reunion.titulo.equals(titulo)) { // Busca la reunión por título
                reunion.agregarParticipante(participante); // Añade el participante a la reunión
                break; // Sale del bucle una vez encontrada la reunión
            }
        }
    }

    // Método para mostrar todas las reuniones
    public void mostrarReuniones() {
        for (Reunion reunion : reuniones) { // Recorre la lista de reuniones
            System.out.println(reunion); // Muestra cada reunión
        }
    }
}
