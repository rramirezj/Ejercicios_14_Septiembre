package tienda; // Se declara el paquete "tienda"

import java.util.ArrayList;
import java.util.List;

// Clase Inventario para gestionar los productos de la tienda
public class Inventario {
    private List<Producto> productos;

    // Constructor para inicializar la lista de productos
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para actualizar la cantidad de un producto específico
    public void actualizarInventario(String nombre, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                producto.setCantidad(cantidad);
                break;
            }
        }
    }

    // Método para registrar una venta y actualizar el inventario
    public void registrarVenta(String nombre, int cantidadVendida) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                int nuevaCantidad = producto.getCantidad() - cantidadVendida;
                producto.setCantidad(nuevaCantidad);
                break;
            }
        }
    }

    // Método para consultar productos por categoría
    public List<Producto> consultarPorCategoria(String categoria) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                resultado.add(producto);
            }
        }
        return resultado;
    }

    // Método para consultar productos por rango de precios
    public List<Producto> consultarPorPrecio(double precioMin, double precioMax) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= precioMin && producto.getPrecio() <= precioMax) {
                resultado.add(producto);
            }
        }
        return resultado;
    }

    // Método para mostrar todos los productos en el inventario
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio() +
                               ", Cantidad: " + producto.getCantidad() + ", Categoría: " + producto.getCategoria());
        }
    }
}
