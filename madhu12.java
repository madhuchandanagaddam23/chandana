class TablePrinter extends Thread {
    int number;

    // Constructor
    TablePrinter(int number) {
        this.number = number;
    }

    // run() method executed when thread starts
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiplicationTableThread {
    public static void main(String[] args) {
        int num = 5; // you can change this number or take input from user
        TablePrinter t1 = new TablePrinter(num);
        t1.start(); // start the thread
    }
}
