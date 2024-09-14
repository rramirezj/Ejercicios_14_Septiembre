package cine; // Declaramos el paquete "cine"

import java.util.ArrayList; // Se importa la clase ArrayList para manejar listas dinámicas

public class ReservaCine {
    ArrayList<Pelicula> peliculas; // Lista de películas

    // Constructor de la clase "ReservaCine"
    public ReservaCine() {
        this.peliculas = new ArrayList<>(); // Inicializa la lista de películas
    }

    // Método para agregar una nueva película
    public void agregarPelicula(String titulo) {
        Pelicula pelicula = new Pelicula(titulo); // Se crea un objeto de "película"
        peliculas.add(pelicula); // Añade la película a la lista
    }

    // Método para reservar un asiento en una película
    public void reservarAsiento(String titulo, String asiento) {
        for (Pelicula pelicula : peliculas) { // Recorre la lista de películas
            if (pelicula.titulo.equals(titulo)) { // Busca la película por título
                pelicula.reservarAsiento(asiento); // Reserva el asiento en la película
                break; // Sale del bucle una vez es encontrada la película
            }
        }
    }

    // Método para mostrar todas las películas y sus reservas
    public void mostrarReservas() {
        for (Pelicula pelicula : peliculas) { // Recorre la lista de películas
            System.out.println(pelicula); // Muestra cada película y sus reservas
        }
    }
}
