package tienda; // Se declara el paquete "tienda"

// Se crea la clase Producto para almacenar la información de un producto
public class Producto {
 private String nombre;
 private double precio;
 private int cantidad;
 private String categoria;

 // Constructor para inicializar el producto
 public Producto(String nombre, double precio, int cantidad, String categoria) {
     this.nombre = nombre;
     this.precio = precio;
     this.cantidad = cantidad;
     this.categoria = categoria;
 }

 // Métodos getters y setters
 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public double getPrecio() {
     return precio;
 }

 public void setPrecio(double precio) {
     this.precio = precio;
 }

 public int getCantidad() {
     return cantidad;
 }

 public void setCantidad(int cantidad) {
     this.cantidad = cantidad;
 }

 public String getCategoria() {
     return categoria;
 }

 public void setCategoria(String categoria) {
     this.categoria = categoria;
 }
}
