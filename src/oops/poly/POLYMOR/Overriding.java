package src.oops.poly.POLYMOR;

 class Overriding2 {

    public int show(int a, int b) {
        return a + b;
    }
}

class overiding1 extends Overriding2 {

     public int show(int a, int b) {

             return a + b + 5;
         }
     }

public class Overriding{
        public static void main(String[] args) {
            overiding1 obj = new overiding1();
            int r1=obj.show(1, 2);
            System.out.println(r1);

        }
    }
