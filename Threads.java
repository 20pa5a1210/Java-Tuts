class A extends Thread {
    public void run()  {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class Threads {
    public static void main(String[] args)  {
        A obj = new A();
        B obj1 = new B();

        obj.start();
        obj1.start();
    }
}
