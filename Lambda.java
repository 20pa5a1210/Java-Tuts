interface A {
    // void show();
    int add(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        // A obj = () -> System.out.println("hello");

        // obj.show();

        A obj = new A() {
            public int add(int a, int b) {
                return 8;
            }
        };

        A obj1 = (i, j) -> 8;

        System.out.println(obj.add(3, 5));
    }
}
