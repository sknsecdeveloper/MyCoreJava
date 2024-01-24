package jlc.marker;

public class MarkerTest {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        process(a);
        process(b);



    }

    public static void process(Object object) {
        if(object instanceof MarkerDemo) {
            System.out.println("Data processed");
        }
        else {
            System.out.println("not instance of MerkerDemo");
        }
    }
}


class MarkerDemo {

}

class A extends MarkerDemo {

}

class B {}