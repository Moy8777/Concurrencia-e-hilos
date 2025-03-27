package hilo;

/**
 * La clase ProcesoPrincipal contiene el método main, que inicia la ejecución del programa.
 * Se encarga de crear y ejecutar dos hilos utilizando la clase Hilo.
 */
public class ProcesoPrincipal {

    /**
     * Método principal que inicia la ejecución del programa.
     * Crea e inicia dos hilos y espera a que finalicen antes de terminar.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        System.out.println("Iniciando proceso principal...");

        // Crear e iniciar dos hilos
        Hilo hilo1 = new Hilo();
        Hilo hilo2 = new Hilo();

        // Asignar nombres a los hilos
        hilo1.setName("Hilo-1");
        hilo2.setName("Hilo-2");

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();

        // Esperar a que los hilos terminen antes de continuar
        try {
            hilo1.join(); // Espera a que hilo1 termine
            hilo2.join(); // Espera a que hilo2 termine
        } catch (InterruptedException e) {
            System.out.println("Proceso principal interrumpido.");
        }

        System.out.println("Proceso principal finalizado.");
    }
}
