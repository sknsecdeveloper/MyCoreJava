package arnab.thread.objectVsClass;

public class ObjectRunnable implements Runnable{

    @Override
    public void run() {
        objectSync();
    }

    public  void objectSync(){

        System.out.println(Thread.currentThread().getName());
  //t1, t2, t3
        synchronized (ObjectRunnable.class) {

            try {
                Thread.sleep(5000);
                //t1
                System.out.println("in synchronized block thread "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
