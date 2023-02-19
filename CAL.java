class Calculator {
    public int Add(int num1, int num2) {
        return num1 + num2;
    }

    public int Add(int n1, int n2, int n3) {
        return n1 + n2;
    }
}

public class CAL {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.Add(1, 2));
    }
}
