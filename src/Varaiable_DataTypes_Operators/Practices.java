package Day1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {

//Write a Java program to print "Hello" on screen and then print your name is separate line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Hello " + "\n" + s);


//Write a Java program to print the sum of two numbers
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int i = ab.nextInt();
        Scanner bc = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int i1 = bc.nextInt();
        System.out.println("The sum of two numbers are: "+(i+i1));

// write a program to swap two numbers

        int a =10;
        int b =20;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

    }
}
