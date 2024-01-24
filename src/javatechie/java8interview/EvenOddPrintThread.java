package javatechie.java8interview;

public class EvenOddPrintThread implements Runnable {

    Object object;
    int count =1;

    public EvenOddPrintThread(Object object) {
        this.object = object;
    }


    @Override
    public void run() {

        while(count<=10) {
            if(count%2==0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() +" ===  "+count);
                    count++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if(count%2!=0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() +" ===  "+count);
                    count++;
                    notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object object = new Object();
        Thread thread1 = new Thread(new EvenOddPrintThread(object));
        thread1.setName("even");
        Thread thread2 = new Thread(new EvenOddPrintThread(object));
        thread2.setName("odd");

        thread1.start();
        thread2.start();
    }
}
