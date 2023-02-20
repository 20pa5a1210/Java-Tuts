class A {
    public void show() {
        System.out.println("CLASS A");
    }
}

class B extends A {
    public void show1() {
        System.out.println("CLASS B");
    }
}

public class Casting {
    public static void main(String[] args) {
        // double d = 4.5;

        // int i = (int) d;

        // System.out.println(d);
        // System.out.println(i);

        A obj1 = new B();

        B obj = (B) obj1;
        obj.show();
        obj.show1();
    }
}
