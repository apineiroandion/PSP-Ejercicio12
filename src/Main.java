public class Main {
    static Integer contador = 0;
    public static void main(String[] args) {
        Contador hilo1 = new Contador();
        Contador hilo2 = new Contador();
        Contador hilo3 = new Contador();
        Contador hilo4 = new Contador();

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
    public static synchronized void incrementarContador() {
            contador++;
    }
}
