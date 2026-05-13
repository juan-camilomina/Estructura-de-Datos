package main;

import historial.HistorialNavegacion;
import productos.DirectorioProductos;
import pedidos.SistemaPedidos;

public class Main {
    public static void main(String[] args) {

        // ===== SECCIÓN 1 =====
        System.out.println("=== Historial de Navegación ===");
        HistorialNavegacion h = new HistorialNavegacion();

        h.agregarPagina("google.com");
        h.agregarPagina("github.com");
        h.agregarPagina("stackoverflow.com");

        h.mostrarPaginaActual();
        h.atras();
        h.mostrarPaginaActual();
        h.mostrarHistorial();

        // ===== SECCIÓN 2 =====
        System.out.println("\n=== Directorio de Productos ===");
        DirectorioProductos.ejecutar();

        // ===== SECCIÓN 3 =====
        System.out.println("\n=== Sistema de Pedidos ===");
        SistemaPedidos.ejecutar();
    }
}