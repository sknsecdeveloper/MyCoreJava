package poly;

public class Child extends Parent implements Interface1, Interface2{

    @Override
    public void print() {
        System.out.println("Child");
    }

    public static void main(String[] args) {

        Parent parent = new Child();
        parent.print();






    }

    @Override
    public void test() {
        System.out.println("print from Child class");

        super.print();
    }
}
