package arnab.thread.communicate;

import java.util.LinkedList;

public class PC {

    public static void main(String[] args) throws InterruptedException {

        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread producerThread = new Thread(()-> producerConsumer.produce(), "PRODUCER THREAD");
        Thread consumerThread = new Thread(()-> producerConsumer.consumerr(), "CONSUMER THREAD");

        producerThread.start();
        consumerThread.start();
    }
}

class ProducerConsumer {
    LinkedList<Integer> linkedList = new LinkedList<>();
    final Object lock = new Object();
    int capacity = 2;

    public void produce(){
        int data=0;
        while(true) {

            synchronized (this) {
                while (linkedList.size()>=capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                linkedList.add(data);
                System.out.println(Thread.currentThread().getName()+"   -------Produced");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                notify();
            }
        }
    }

    public void consumerr(){
        while (true) {
            synchronized (this) {
                while (linkedList.isEmpty()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                linkedList.removeFirst();
                System.out.println(Thread.currentThread().getName()+"   -------Consumed");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                notify();
            }
        }
    }


}
