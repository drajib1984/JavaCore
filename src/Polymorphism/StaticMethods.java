package Polymorphism;

public class StaticMethods {
    static  int a =20;
    int b =30;
    static String s = "welcome";

    static void m1() //static method
    {
        System.out.println("This is m1: static method");
    }
    void m2() //non-static method
    {
        System.out.println("This is m2: Non-static method");
    }

    void m3() //non-static method
    {
        System.out.println("This is m3: Non-static method");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }



    public static void main(String[] args) {
        m1(); //static method (PSVM) access static method w/o object
        System.out.println(StaticMethods.a); //static method (PSVM) access static variable w/o object

        StaticMethods sm = new StaticMethods();
        sm.m2();//static method (PSVM) access non-static method with object
        System.out.println(sm.b);//static method(PSVM)  access non-static variable with object

        sm.m3(); //non-static method can access both static & non-static stuff with object

        System.out.println(StaticMethods.s.length());


    }
}
