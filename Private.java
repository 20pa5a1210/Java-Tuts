class Human {
    private int age;
    private String Name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}

public class Private {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(22);
        h1.setName("Surya");
        // System.out.println(h1.GetAge());
        // System.out.println(h1.GetName());
        // h1.Name = "surya";
        // h1.age = 22;
    }

}
