package SmallTest;

public class SyncThreadTest {
    public static void main(String[] args) {

//        SyncThread syncThread = new SyncThread();
//        Thread thread1 = new Thread(syncThread, "SyncThread1");
//        Thread thread2 = new Thread(syncThread, "SyncThread2");
        new Thread(new SyncThread("SyncThread1") ).start();
        new Thread(new SyncThread("SyncThread2") ).start();
//        thread1.start();
//        thread2.start();
    }
}
