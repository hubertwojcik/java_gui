package W06.MultiThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.start();

//        Klasa anonimowa
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Trzeci wątek");
            }
        });
        t2.start();

//Lambda wyrażenie
        Thread t3 = new Thread(() -> System.out.println("Czwarty wątek"));
        t3.start();


//        Brak Sync
        Thread nonSyncThread1 = new NonSyncThread();
        Thread nonSyncThread2 = new NonSyncThread();
        Thread nonSyncThread3 = new NonSyncThread();

        nonSyncThread1.start();
        nonSyncThread2.start();
    nonSyncThread3.start();

        try {
            nonSyncThread1.join();
            nonSyncThread2.join();
            nonSyncThread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(NonSyncThread.value);

//        Z Sync
        System.out.println("Blok synchronizacyjny");
        Thread syncThread1 = new SyncThread1();
        Thread syncThread2 = new SyncThread1();
        Thread syncThread3 = new SyncThread1();

        syncThread1.start();
        syncThread2.start();
        syncThread3.start();

        try {
            syncThread1.join();
            syncThread2.join();
            syncThread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(SyncThread1.value);

        System.out.println("Blok synchronizacyjny 2");
        Thread syncThread4 = new SyncThread2();
        Thread syncThread5 = new SyncThread2();
        Thread syncThread6 = new SyncThread2();

        syncThread4.start();
        syncThread5.start();
        syncThread6.start();

        try {
            syncThread4.join();
            syncThread5.join();
            syncThread6.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(SyncThread2.value);
    }
}
