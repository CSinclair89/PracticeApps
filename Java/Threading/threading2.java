package Threading;
public class threading2 {
    public static void main(String[] args) {

        Thread thread0 = new Thread(new MyRunnable2("Ping"));
        Thread thread1 = new Thread(new MyRunnable2("Pong"));

        System.out.println("Game Start!");

        thread0.start();
        thread1.start();

        try {
            thread0.join();
            thread1.join();
        } catch(InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Game Over!");

    }
}
