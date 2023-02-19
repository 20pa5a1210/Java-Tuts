class A {
    public void show() {
        System.out.println("IN CLASS A");
    }
}

class B extends A {
    public void show() {
        System.out.println("IN CLASS b");
    }

}

class C extends B {
    public void show() {
        System.out.println("IN CLASS C");
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        B obj = new C();
        obj.show();
    }
}
