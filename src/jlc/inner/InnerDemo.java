package jlc.inner;

public class InnerDemo {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.print();

        Outer.Inner inner = new Outer.Inner();
        inner.printVar();

        Outer.NonStaticInner nonStaticInner = outer.new NonStaticInner();
        nonStaticInner.innerNonStaticM1();



    }
}

class Outer {

    public static String outerStatic = "outerStaticVar";
    public  String outerNonStatic = "outerNonStaticVar";
    public void print(){
        System.out.println("hello from outer method");
    }

    public Outer(){
        System.out.println("Constructor Outer");
    }

    static class Inner {
        public String innerNonStaticVariable = "innerNonStaticVariable";
        public static String innerStaticVariable = "innerStaticVariable";

        public Inner() {
            System.out.println("Constructor Inner");
        }

        public void printVar(){
            System.out.println("inner static m1()");
            System.out.println("outer static variable :" +outerStatic);
            //System.out.println("inner static variable :" +ou);
        }

        public void innerNonStaticM1(){
            System.out.println("innerNonStaticM1()");
        }
    }

     class NonStaticInner {
        public String innerNonStaticVariable = "NonStaticInner innerNonStaticVariable";
        //public static String innerStaticVariable = "NonStaticInner innerStaticVariable";

        public NonStaticInner(){
            System.out.println("Constructor NonStaticInner");
        }

        public  void innerStaticM1(){
            System.out.println("NonStaticInner inner static m1()");
            System.out.println("nonStaticInner static variable out");

        }

        public void innerNonStaticM1(){
            System.out.println("NonStaticInner innerNonStaticM1()");
            System.out.println(outerStatic);
            System.out.println(outerNonStatic);
        }
    }
}
