class a {
    public a() {
        System.out.println("IN A");
    }

    public a(int n) {
        System.out.println("int a");
    }
}

class b extends a {
    public b() {
        System.out.println("in b");
    }

    public b(int n) {
        this();
        System.out.println("int B");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        b obj = new b(5);
    }
}
