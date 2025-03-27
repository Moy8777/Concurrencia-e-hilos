package hilo;

/**
 * La clase Hilo extiende la clase Thread y representa un hilo de ejecución en Java.
 * Cuando se inicia, este hilo imprimirá su nombre y contará hasta 5 con intervalos de 1 segundo.
 */
public class Hilo extends Thread {

    /**
     * Método que se ejecuta cuando se inicia el hilo.
     * Imprime mensajes indicando el inicio y finalización del hilo, así como un contador que va del 1 al 5.
     */
    @Override
    public void run() {
        System.out.println("Hilo iniciado: " + Thread.currentThread().getName());
        try {
            // Bucle que cuenta del 1 al 5, con pausas de 1 segundo entre cada número
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Contador: " + i);
                Thread.sleep(1000); // Detiene el hilo durante 1 segundo
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido.");
        }
        System.out.println("Hilo finalizado: " + Thread.currentThread().getName());
    }
}
