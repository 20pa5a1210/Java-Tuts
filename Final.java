class A {
    public void show() {
        System.out.println("CLASS A");
    }

    final public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class B extends A {
    static public void add(int a, int b, int c) {
        System.out.println(a);
    }
}

public class Final {
    public static void main(String[] args) {
        B.add(1, 2, 4);
        // final float PI = 8.1f;
        // System.out.println(PI);

    }
}
