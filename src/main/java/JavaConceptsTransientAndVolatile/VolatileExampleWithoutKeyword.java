package JavaConceptsTransientAndVolatile;

public class VolatileExampleWithoutKeyword {
	private volatile boolean running = true;  // Not using volatile

    public void runThread() {
        while (running) {
            // Busy-waiting loop
        }
        System.out.println("Thread stopped.");
    }

    public void stopThread() {
        running = false;
    }

    public static void main(String[] args) {
        VolatileExampleWithoutKeyword example = new VolatileExampleWithoutKeyword();

        Thread thread = new Thread(example::runThread);
        thread.start();

        try {
            Thread.sleep(2000);  // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stopping thread...");
        example.stopThread();
    }

}
