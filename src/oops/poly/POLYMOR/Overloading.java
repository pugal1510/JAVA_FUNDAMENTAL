package src.oops.poly.POLYMOR;

public class Overloading {

    public void hello(){
        System.out.println("hello");
    }
    public void hello(int a){
        System.out.println(a);
    }



    public static void main(String[] args) {
        Overloading ob=new Overloading();
        ob.hello();
        ob.hello(2);
    }
}
