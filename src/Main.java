public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        String str = "subhash";
        String a = str;
        System.out.println(str==a); //1 true
        System.out.println(str.equals(a)); //2 ture

        String str1 = "subhash";
        String str2 = new String("subhash");

        System.out.println(str==str1);//3 true
        System.out.println(str.equals(str1)); // 4 true
        System.out.println(str1==str2); // 5 false
        System.out.println(str1.equals(str2)); // 6 true
    }




}


interface IrequestHandler {
    public void getdata();
}
interface IresponseHandler{
    public void getdata();
}

class RequestHandler implements IrequestHandler{

    @Override
    public void getdata() {

    }
}

class ResponseHandler implements IresponseHandler{

    @Override
    public void getdata() {

    }
}

class CheckClass extends RequestHandler {

}