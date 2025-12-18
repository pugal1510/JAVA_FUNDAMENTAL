package src.oops.poly.Abstract;

abstract class vehicle{
     abstract void show();
}
class vehicle1 extends vehicle{

     void show() {
       System.out.println("hello");

    }
}



public class abstract1 {
    public static void main(String[] args) {
        vehicle1 obj=new vehicle1() ;
        obj.show();
    }
}
