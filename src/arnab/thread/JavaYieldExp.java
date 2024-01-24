package arnab.thread;

public class JavaYieldExp extends Thread
{
    public void run()
    {
        for (int i=0; i<3 ; i++)
            System.out.println(Thread.currentThread().getName() + " in control");
    }
    public static void main(String[]args)
    {
        JavaYieldExp t1 = new JavaYieldExp();
        t1.setName("t1");
        JavaYieldExp t2 = new JavaYieldExp();
        t2.setName("t2");
        // this will call run() method
        t1.start();
        t2.start();
        for (int i=0; i<3; i++)
        {
            // Control passes to child thread
            t1.yield();
            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }
}