class FirstThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000);  // Sleep for 10 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SecondThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000);  // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class thread{
    public static void main(String[] args) {
        // Create the threads
        FirstThread thread1 = new FirstThread();
        SecondThread thread2 = new SecondThread();

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
