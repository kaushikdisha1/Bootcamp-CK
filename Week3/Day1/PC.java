package Week3.Day1;

// Shares a single buffer between producer and consumer threads
class Buffer {
    int value;
    boolean available = false;

// Producer puts value into buffer
    synchronized void put(int v) throws InterruptedException {
        while (available) wait();
        value = v;
        System.out.println("Produced: " + v);
        available = true;
        notify();
    }

// Consumer gets value from buffer
    synchronized void get() throws InterruptedException {
        while (!available) wait();
        System.out.println("Consumed: " + value);
        available = false;
        notify();
    }
}

public class PC {
    public static void main(String[] args) {
        Buffer b = new Buffer();

    // Producer thread
        new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                try { b.put(i); } catch (Exception e) {}
            }
        }).start();

    // Consumer thread
        new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                try { b.get(); } catch (Exception e) {}
            }
        }).start();
    }
}
