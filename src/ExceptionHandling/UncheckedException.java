package ExceptionHandling;

public class UncheckedException {
    public static void main(String[] args) {
        int a = 100;
        int arr[] = null;
        String s = "123";

        System.out.println("Starting the program");

        try {
            int b = a / 0;
            System.out.println(b);
        }
        catch (ArithmeticException arithmeticException)//mention the type of exception in case you know it
        {
            System.out.println("Arithmetic exception handled");
        }

        try {
            arr[3]= 12;
            System.out.println(arr);
        }
        catch (NullPointerException nullPointerException)
        {
            System.out.println("Handled null point exception");;
        }
        try {
            int y = Integer.parseInt(s);
            System.out.println(y);
        }
        catch (Exception exception) // in case not sure of exception type use
        // Exception which is parent of all exceptions
        {
            System.out.println("Unknown exception handled");
        }
        finally {
            System.out.println("In finally block");
        }




        System.out.println("program execution done");
        System.out.println("program complete");


    }


}
