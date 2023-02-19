class A {
    public A() {
        System.out.println("ObJ Created");
    }

    public void show() {
        System.out.println("SHOW METHOD!");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        new A().show();// anonymous Object
        A a = new A();// Referenced Object
        a.show();
    }
}