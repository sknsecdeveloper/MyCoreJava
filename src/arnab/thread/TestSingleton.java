package arnab.thread;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonDoubleNullCheck singletonDoubleNullCheck1 = SingletonDoubleNullCheck.getInstance();

        SingletonDoubleNullCheck singletonDoubleNullCheck2 = SingletonDoubleNullCheck.getInstance();

        System.out.println(singletonDoubleNullCheck1==singletonDoubleNullCheck2);


        System.out.println(singletonDoubleNullCheck1.hashCode()==singletonDoubleNullCheck2.hashCode());


    }
}
