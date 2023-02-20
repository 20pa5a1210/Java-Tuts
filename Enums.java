
enum Status {
    Running, Pending, Failed, Success;
}

enum Laptops {
    MACBOOK(2000),
    XPS(2030),
    SURFACE(1001),
    REDMI(800);

    private int price;

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enums {
    public static void main(String[] args) {
        Status S = Status.Success;
        // System.out.println(S);
        // Status F[] = Status.values();
        // for (Status s : F) {
        // System.out.println(s);
        // }
        switch (S) {
            case Running:
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Success:
                System.out.println("DONE");
        }
        System.out.println(S.getClass().getSuperclass());

        Laptops lap = Laptops.MACBOOK;
        // System.out.println(lap.getPrice());

        for (Laptops l : Laptops.values()) {
            System.out.println(l + " " + l.getPrice());
        }

    }
}
