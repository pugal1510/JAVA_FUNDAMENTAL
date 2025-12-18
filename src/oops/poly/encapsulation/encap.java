package src.oops.poly.encapsulation;

class cricket{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



public class encap {
    public static void main(String[] args) {
        cricket obj=new cricket();
       obj.setName("pugal");
        obj.setAge(15);

    }
}
