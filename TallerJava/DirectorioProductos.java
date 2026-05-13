package productos;

import java.util.HashMap;
import java.util.Map;

public class DirectorioProductos {

    public static void ejecutar() {
        Map<Integer, String> productos = new HashMap<>();

        // Registrar productos
        productos.put(101, "Laptop");
        productos.put(102, "Mouse");
        productos.put(103, "Teclado");

        // Verificar existencia
        System.out.println("¿Existe el código 102? " + productos.containsKey(102));

        // Insertar clave repetida
        productos.put(101, "Tablet"); // Reemplaza Laptop

        // Recorrer mapa
        System.out.println("Lista de productos:");
        for (Integer clave : productos.keySet()) {
            System.out.println("Código: " + clave + " -> Producto: " + productos.get(clave));
        }
    }
}