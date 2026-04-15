import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Puerto {

    Contenedor[] manifiesto;
    Contenedor[][] patio;
    Queue<Contenedor> inspeccion;
    Stack<Contenedor> buque;

    public Puerto(int n, int r, int k) {
        manifiesto = new Contenedor[n];
        patio = new Contenedor[r][k];
        inspeccion = new LinkedList<>();
        buque = new Stack<>();
    }

    // =========================
    // 1. MANIFIESTO (MANUAL)
    // =========================
    public double registrarContenedores() {

        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int i = 0; i < manifiesto.length; i++) {

            System.out.println("\n Contenedor " + (i + 1));

            System.out.print("ID: ");
            String id = sc.next();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            System.out.print("Prioridad: ");
            int prioridad = sc.nextInt();

            manifiesto[i] = new Contenedor(id, peso, prioridad);
            total += peso;
        }

        return total;
    }

    // =========================
    // 2. MATRIZ (PATIOS)
    // =========================
    public boolean ubicarContenedor(Contenedor c) {

        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {

                if (patio[i][j] == null) {
                    patio[i][j] = c;
                    return true;
                }
            }
        }

        System.out.println(" Puerto Saturado");
        return false;
    }

    // =========================
    // 3. COLA FIFO
    // =========================
    public void enviarInspeccion(Contenedor c) {
        inspeccion.add(c);
    }

    public Contenedor procesarInspeccion() {
        return inspeccion.poll();
    }

    // =========================
    // 4. PILA LIFO (MEJOR BALANCEADA)
    // =========================
    public boolean cargarBuque(Contenedor c) {

        if (!buque.isEmpty()) {

            Contenedor top = buque.peek();

            //  regla más realista (no tan estricta)
            if (Math.abs(c.peso - top.peso) > 20) {
                System.out.println(" Rechazado por inestabilidad");
                return false;
            }
        }

        buque.push(c);
        return true;
    }

    // =========================
    // MOSTRAR BUQUE
    // =========================
    public void mostrarBuque() {

        System.out.println("\n BUQUE FINAL:");
        System.out.println(buque);
    }
}