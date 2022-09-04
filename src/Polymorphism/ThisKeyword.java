package Polymorphism;

public class ThisKeyword {
    int a,b;  // instance variables or class variables

    void getValues(int a , int b)   //method variables
    {
        this.a=a;  //this key word used to show the class variables when both method and class variables are same
        this.b=b;  // using the same variables can save memory
    }
    void printValues(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword();
        tk.getValues(20,35);
        tk.printValues();
    }
}
