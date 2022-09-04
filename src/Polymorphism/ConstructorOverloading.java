package Polymorphism;

public class ConstructorOverloading {
    public ConstructorOverloading(int a, int b) {
        System.out.println(a+b);
    }
    public ConstructorOverloading(double a, int b) {
        System.out.println(a+b);
    }
    public ConstructorOverloading(int a, double b) {
        System.out.println(a+b);
    }
    public ConstructorOverloading(double a, double b) {
        System.out.println(a+b);
    }
    public ConstructorOverloading(double a, double b, double c) {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading(5,7);
        ConstructorOverloading c2 = new ConstructorOverloading(5.5,8);
        ConstructorOverloading c3 = new ConstructorOverloading(5,8.7);
        ConstructorOverloading c4 = new ConstructorOverloading(8.5,12.6);
        ConstructorOverloading c5 = new ConstructorOverloading(12.8,13.7,45.9);
    }
}
