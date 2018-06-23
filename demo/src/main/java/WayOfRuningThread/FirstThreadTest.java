package WayOfRuningThread;

public class FirstThreadTest extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(getName()+"-----"+i);
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"   : "+i);
            //上述代码中Thread.currentThread()方法返回当前正在执行的线程对象。GetName()方法返回调用该方法的线程的名字。即为main
            if(i==5){
                new FirstThreadTest().start();
                new FirstThreadTest().start();
            }
        }
    }
}
