package thread;

public class Thread1 extends Thread {
    private String name;
    public Thread1(String name) {
        this.name=name;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 100);
                // Math.random()产随机数  0间   再乘3000；前面int呢  乘3000随机数强制转换int类型  再调用Thread.sleep（time）函数  让线程休眠time毫秒//
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
