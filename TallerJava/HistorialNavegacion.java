package historial;

import java.util.LinkedList;

public class HistorialNavegacion {
    private LinkedList<String> historial;

    public HistorialNavegacion() {
        historial = new LinkedList<>();
    }

    public void agregarPagina(String url) {
        historial.add(url);
    }

    public void mostrarPaginaActual() {
        if (!historial.isEmpty()) {
            System.out.println("Página actual: " + historial.getLast());
        }
    }

    public void atras() {
        if (!historial.isEmpty()) {
            historial.removeLast();
            if (!historial.isEmpty()) {
                System.out.println("Nueva página actual: " + historial.getLast());
            } else {
                System.out.println("No hay más páginas.");
            }
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial:");
        for (String url : historial) {
            System.out.println(url);
        }
    }
}