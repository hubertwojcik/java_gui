package W06.MultiThread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Drugi wątek");
    }
}
