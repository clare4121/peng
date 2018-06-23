//package Threading;
//
//class  Worker implements Runnable{
//    public ThreadExcutor te = new ThreadExcutor();
//
//    public Worker(Runnable runnable){
//        te.queue.offer(runnable);
//    }
//
//    public void run() {
//        while (true && RUNNING){
//            if(shutdown == true){
//                Thread.interrupted();
//            }
//            Runnable task = null;
//            try {
//                task = getTask();
//                task.run();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public Runnable getTask() throws InterruptedException {
//        return queue.take();
//    }
//
//    public void interruptIfIdle() {
//        for (Thread thread :threadList) {
//            System.out.println(thread.getName() + " interrupt");
//            thread.interrupt();
//        }
//    }
//}