class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // set thread name
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
            try {
                Thread.sleep(500); // half second delay for clarity
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadOrderExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        try {
            t1.start();   // Start first thread
            t1.join();    // Wait until t1 finishes completely

            t2.start();   // Now start second thread
            t2.join();    // Wait for t2 to finish (optional)
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
