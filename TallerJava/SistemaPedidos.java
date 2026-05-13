package pedidos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SistemaPedidos {

    public static void ejecutar() {
        Map<String, LinkedList<String>> pedidos = new HashMap<>();

        // Cliente Ana
        LinkedList<String> listaAna = new LinkedList<>();
        listaAna.add("Camisa");
        listaAna.add("Pantalón");
        pedidos.put("Ana", listaAna);

        // Cliente Luis
        LinkedList<String> listaLuis = new LinkedList<>();
        listaLuis.add("Zapatos");
        pedidos.put("Luis", listaLuis);

        // Cantidad de productos de Ana
        System.out.println("Ana tiene " + pedidos.get("Ana").size() + " productos.");

        // Agregar producto a Luis
        pedidos.get("Luis").add("Gorra");

        // Mostrar pedidos
        System.out.println("Pedidos:");
        for (String cliente : pedidos.keySet()) {
            System.out.println(cliente + ": " + pedidos.get(cliente));
        }
    }
}