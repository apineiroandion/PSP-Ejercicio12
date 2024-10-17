public class Contador extends Thread {
    private final Integer LIMITE_INTERACCIONES = 100;
    private final Integer TIEMPO_ESPERA = 100;
    public void run() {
        for (int i = 0; i < LIMITE_INTERACCIONES; i++) {
            Main.incrementarContador();
            System.out.println("Contador: " + Main.contador);
            try {
                Thread.sleep(TIEMPO_ESPERA);
            } catch (InterruptedException e) {
                System.out.println("No pudo dormir");
            }
        }
    }

}
