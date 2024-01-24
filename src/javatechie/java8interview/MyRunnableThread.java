package javatechie.java8interview;

public class MyRunnableThread implements Runnable {

    public void run(){
        System.out.println("runnable thread is running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnableThread());
        thread.start();
    }
}
