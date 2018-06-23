package thread.waytest;

    public class ThreadTest implements Runnable {
        public static int a = 0;
        public void run() {
            for (int k = 0; k < 5; k++) {
                a = a + 1;
            }
        }
        public static void main(String[] args) throws Exception {
            Runnable r = new ThreadTest();
            Thread t = new Thread(r);
         //   t.sleep(500);
            t.start();
            //t.join();

            for (int i=0; i<300; i++) {
/*
 注意循环体内一定要有实际执行语句，否则编译器或JVM可能优化掉你的这段代码，视这段代
 码为无效。
*/
                System.out.print(i);
            }
            System.out.println();
            System.out.println(a);
        }
            //System.out.println(a);
        }



