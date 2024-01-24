package jlc.poly;

class A {}
class B extends A {}
class C extends B {}


public class PolyMain {

    static void overloadedMethod(A a){
        System.out.println("A");
    }
    static void overloadedMethod(B b){
        System.out.println("B");
    }
    static void overloadedMethod(Object o){
        System.out.println("Object");
    }

    public static void main(String[] args) {
        C c = new C();
        overloadedMethod(c);// it will look for more specific(nearest) class type
    }
}
