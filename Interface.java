interface A {

    int age = 0;

    void show();

    void config();

}

class B implements A {

    @Override
    public void show() {
        System.out.println("SHOW Method");
    }

    @Override
    public void config() {
        System.out.println("Config");
    }

}

interface Computer {
    public void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("RUN DEBUG ");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Faster Coding");
    }
}

class Developer {
    public void DevApp(Computer lap) {
        lap.code();
    }
}

public class Interface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.DevApp(desk);
    }
}
