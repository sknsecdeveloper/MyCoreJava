package arnab.thread.objectVsClass;

public class TestObjectLevelLock  {

    public static void main(String[] args) {

        ObjectRunnable objectRunnable1 = new ObjectRunnable();
        Thread  objectRunnable1_t1 = new Thread(objectRunnable1, "objectRunnable1_t1");
        Thread  objectRunnable1_t2 = new Thread(objectRunnable1, "objectRunnable1_t2");

        ObjectRunnable objectRunnable2 = new ObjectRunnable();
        Thread  objectRunnable2_t1 = new Thread(objectRunnable2, "t3");


        objectRunnable1_t1.start();
        objectRunnable1_t2.start();

        objectRunnable2_t1.start();








    }
}
