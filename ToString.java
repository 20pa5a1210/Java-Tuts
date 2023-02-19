class Laptop {
    String Model;
    int price;

    public String toString() {
        return Model + " " + price;
    }

    public boolean equals(Laptop obj) {
        // if (this.Model.equals(obj.Model)) {
        // return true;
        // }
        // return false;

        return this.Model.equals(obj.Model) || this.price == obj.price;
    }
}

public class ToString {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.Model = "MI";
        obj.price = 990001;
        Laptop obj1 = new Laptop();
        obj1.Model = "MI";
        obj1.price = 99000;
        System.out.println(obj);
        System.out.println(obj1);

        // boolean res = obj.equals(obj1);
        System.out.println(obj.equals(obj1));

    }
}
