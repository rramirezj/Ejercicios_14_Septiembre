package tienda; // Se declara el paquete "tienda"

import java.util.List; // Se importa la clase List para manejar listas de objetos
import java.util.Scanner; // Se importa la clase "Scanner" para leer la entrada del usuario

public class Main {
    public static void main(String[] args) {
       
    	// Se crea un objeto "Scanner" para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
       
        // Se crea un objeto "Inventario" para gestionar los productos
        Inventario miInventario = new Inventario();

        // Bucle para mostrar el menú y procesar las opciones del usuario
        while (true) {
        	
            // Código para mostrar el menú de opciones
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar inventario");
            System.out.println("3. Registrar venta");
            System.out.println("4. Consultar por categoría");
            System.out.println("5. Consultar por precio");
            System.out.println("6. Mostrar productos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            // Código para leer la opción seleccionada por el usuario
            int opcion = scanner.nextInt();
           
            // Código para leer y descartar la nueva línea pendiente del buffer de entrada
            scanner.nextLine();

            // Código para procesar la opción seleccionada por el usuario
            switch (opcion) {
            
                case 1:
                    // Se agrega un nuevo producto al inventario
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea
                    System.out.print("Categoría del producto: ");
                    String categoria = scanner.nextLine();
                    // Crear un nuevo objeto Producto y agregarlo al inventario
                    Producto producto = new Producto(nombre, precio, cantidad, categoria);
                    miInventario.agregarProducto(producto);
                    break;
               
                case 2:
                    // Se actualiza la cantidad de un producto en el inventario
                    System.out.print("Nombre del producto a actualizar: ");
                    nombre = scanner.nextLine();
                    System.out.print("Nueva cantidad: ");
                    cantidad = scanner.nextInt();
                    miInventario.actualizarInventario(nombre, cantidad);
                    break;
               
                case 3:
                    // Se registra una venta y se actualiza el inventario
                    System.out.print("Nombre del producto vendido: ");
                    nombre = scanner.nextLine();
                    System.out.print("Cantidad vendida: ");
                    cantidad = scanner.nextInt();
                    miInventario.registrarVenta(nombre, cantidad);
                    break;
                
                case 4:
                    // Se consultan los productos por categoría
                    System.out.print("Categoría a consultar: ");
                    categoria = scanner.nextLine();
                    List<Producto> productosPorCategoria = miInventario.consultarPorCategoria(categoria);
                    // Mostrar los productos de la categoría consultada
                    for (Producto prod : productosPorCategoria) {
                        System.out.println("Nombre: " + prod.getNombre() + ", Precio: " + prod.getPrecio() +
                                           ", Cantidad: " + prod.getCantidad() + ", Categoría: " + prod.getCategoria());
                    }
                    break;
                
                case 5:
                    // Se consultan los productos por rango de precios
                    System.out.print("Precio mínimo: ");
                    double precioMin = scanner.nextDouble();
                    System.out.print("Precio máximo: ");
                    double precioMax = scanner.nextDouble();
                    List<Producto> productosPorPrecio = miInventario.consultarPorPrecio(precioMin, precioMax);
                    // Mostrar los productos dentro del rango de precios consultado
                    for (Producto prod : productosPorPrecio) {
                        System.out.println("Nombre: " + prod.getNombre() + ", Precio: " + prod.getPrecio() +
                                           ", Cantidad: " + prod.getCantidad() + ", Categoría: " + prod.getCategoria());
                    }
                    break;
                
                case 6:
                    // Se muestran todos los productos en el inventario
                    miInventario.mostrarProductos();
                    break;
               
                case 7:
                    // Salida del programa
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                
                default:
                    // Código para una opción no válida
                    System.out.println("Opción no válida.");
            }
        }
    }
}
