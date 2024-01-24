package javatechie;

public class EvenOddPrint2Thread implements Runnable {
    static int count=1;
    Object object;

    public EvenOddPrint2Thread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
       while(count<=10) {
           if(count%2==0 && Thread.currentThread().getName().equals("even")){
                synchronized (object) {
                    System.out.println("Thread name :"+Thread.currentThread().getName()+ "value " +count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
           }
       }
    }
}
