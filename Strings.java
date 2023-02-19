public class Strings {
    public static void main(String[] args) {
        // String Name = new String("Surya");
        // System.out.println(Name.concat(" A "));

        StringBuffer Str = new StringBuffer("Surya");
        System.out.println(Str.capacity());
        System.out.println(Str.length());
        Str.append(" Undapalli");
        Str.deleteCharAt(5);

        Str.insert(5, " Narayana ");
        System.out.println(
                Str.substring(5));
        System.out.println(Str);
    }
}
