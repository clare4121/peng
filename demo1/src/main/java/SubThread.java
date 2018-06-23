public class SubThread extends Thread{
//
//    public void run() {
//        for (int i = 0; i < 10; i ++){
//            System.out.println(Thread.currentThread().getName() + ":" + i);
//        }

    public static void main(String[] args) {
        System.out.println("begin main");
        SubThread sub = new SubThread();
        sub.start();
        System.out.println("end main");
    }
}