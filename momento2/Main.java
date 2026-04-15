public class Main {

    public static void main(String[] args) {

        Puerto puerto = new Puerto(5, 3, 3);

        // 1. MANUAL
        double total = puerto.registrarContenedores();
        System.out.println("\n2 Peso total: " + total);

        // 2. PATIO
        for (Contenedor c : puerto.manifiesto) {
            puerto.ubicarContenedor(c);
        }

        // 3. INSPECCIÓN
        puerto.enviarInspeccion(puerto.manifiesto[0]);
        System.out.println(" Inspección: " + puerto.procesarInspeccion());

        // 4. BUQUE
        for (Contenedor c : puerto.manifiesto) {
            puerto.cargarBuque(c);
        }

        // 5. RESULTADO FINAL
        puerto.mostrarBuque();
    }
}