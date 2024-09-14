package cine; // Declara el paquete

import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas

public class Pelicula {
    String titulo; // Título de la película
    ArrayList<String> asientosReservados; // Lista de asientos reservados

    // Constructor de la clase Pelicula
    public Pelicula(String titulo) {
        this.titulo = titulo; // Asigna el título de la película
        this.asientosReservados = new ArrayList<>(); // Inicializa la lista de asientos reservados
    }

    // Método para reservar un asiento
    public void reservarAsiento(String asiento) {
        asientosReservados.add(asiento); // Añade el asiento a la lista de asientos reservados
    }

    // Método para representar la película como una cadena de texto
    @Override
    public String toString() {
        return "Película: " + titulo + "\nAsientos reservados: " + asientosReservados;
    }
}
