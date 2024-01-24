package javatechie.java8interview;

public class OddEvenSimple implements Runnable {

    Object object;
    int counter =1;

    public OddEvenSimple(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        while (counter<10) {
            String currentThread = Thread.currentThread().getName();
            if(counter%2==0 && currentThread.equalsIgnoreCase("evenThread")) {
               synchronized (this) {
                   System.out.println(currentThread+" == "+counter);
                   counter++;
                   try {
                       wait();
                      //notify();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
            }
            if(counter%2!=0 && currentThread.equalsIgnoreCase("oddThread")) {
                synchronized (this) {
                    System.out.println(currentThread+" == "+counter);
                    counter++;
                   /* try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }*/
                    notify();
                }
            }
        }

    }

    public static void main(String[] args) {
        Object object = new Object();
        Thread evenThread = new Thread(new OddEvenSimple(object));
        evenThread.setName("evenThread");
        Thread oddThread = new Thread(new OddEvenSimple(object)) ;
        oddThread.setName("oddThread");

        evenThread.start();
        oddThread.start();



    }
}
