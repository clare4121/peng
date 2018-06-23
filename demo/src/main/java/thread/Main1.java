package thread;

public class Main1 {

    public static void main(String[] args) {
        Thread1 mTh1 = new Thread1("A");
        //  new Thread(new Thread1("A")).start();
        Thread1 mTh2 = new Thread1("B");
//        synchronized
        mTh1.start();
        mTh2.start();
    }
}
