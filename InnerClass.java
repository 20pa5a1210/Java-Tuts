class A {
    int age;

    public void show() {
        System.out.println("IN SHOW");
    }

    static class B {
        public void Config() {
            System.out.println("IN CONFIG");
        }
    }
}

abstract class Inner {
    public abstract void innerShow();
}

public class InnerClass {
    public static void main(String[] args) {
        // A a = new A();
        // a.show();

        // A.B obj = new A.B();
        // obj.Config();

        Inner obj = new Inner() {
            public void innerShow() {
                System.out.println("Innner new Show");
            }
        };
        obj.innerShow();
    }

}
