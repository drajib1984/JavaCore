package Polymorphism;

public class MethodOverloading {

    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, double b){
        System.out.println(a+b);
    }
    void sum(double a, int b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.sum(5,4);
        mo.sum(5.5,5);
        mo.sum(5,6.5);
        mo.sum(11.5,12.5);
        mo.sum(5,6,7);
    }

}
