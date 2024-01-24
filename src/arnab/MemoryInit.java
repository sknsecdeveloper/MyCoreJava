package arnab;

public class MemoryInit {

    static String a="Arnab";
     int b = 20;

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }
     public MemoryInit (){
         System.out.println("Constructor");
     }

     public static void m1Static(){

         int x = 10;
         System.out.println("static method");
         System.out.println(a);
     }

     public void m2NonStatic(){
         System.out.println("non static method");
     }


}
