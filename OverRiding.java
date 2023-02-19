class A {
    // public void show() {
    // System.out.println("Method A");
    // }

    // public void confiq() {
    // System.out.println("Method A Confiq");
    // }

    public int add(int a, int b) {
        return a + b;
    }
}

class B extends A {
    // public void show() {
    // System.out.println("Method B");
    // }

    public int add(int a, int b) {
        return a + b + 1;
    }
}

public class OverRiding {
    public static void main(String[] args) {
        B obj = new B();
        // obj.show();
        // obj.confiq();
        System.out.println(obj.add(1, 5));
    }
}
