abstract class Car {
    public abstract void drive();

    public abstract void flyCar();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

abstract class Audi extends Car {
    public void drive() {
        System.out.println("DRIVING");
    }
    // public void flyCar(){

    // }
    public void playMusic() {
        System.out.println("Playing Music Stooped");
    }
}

class BMW extends Audi {

    @Override
    public void flyCar() {
        System.out.println("FLYING");
    }

}

public class Abstract {
    public static void main(String[] args) {
        Car car = new BMW();

        car.drive();
        car.playMusic();
        car.flyCar();
    }

}
