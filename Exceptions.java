
class MyExecption extends Exception {
    public MyExecption(String Str) {
        super(Str);
    }
}

public class Exceptions {
    public static void main(String[] args) throws ArithmeticException {
        // try {
        //     int a = 0;
        //     if (a == 0)
        //         throw new MyExecption("HWll");
        // } catch (MyExecption e) {
        //     System.out.println(e);
        // }

        int a =10;
        int b =0 ;
        int c = a%b;
        System.out.println(a);
    }
}

// arithmetic exception
// array out of bounds exception
// null pointe execption