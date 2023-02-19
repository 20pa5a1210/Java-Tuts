
class Mobile {
    String Name;
    int price;
    static String Type;

    public Mobile() {
        Name = "";
        price = 100;
    }

    static {
        Type = "Mobile";
        System.out.println("IN STATIC BLOCK");
    }

    public void Show() {
        System.out.println(Name + " " + Type + " " + price);
    }
}

public class Static {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile m1 = new Mobile();
        m1.Name = "Redmi";
        // Mobile.Type = "Mobile";

        Mobile m2 = new Mobile();
        m2.Name = "Oppo";
        // Mobile.Type = "Mobie";

        // Mobile.Type = "New Mobile";
        // Mobile.Type = "Smart PhoneMobile";

        m1.Show();
        m2.Show();

        Class.forName("Mobile");
    }
}
