package Varaiable_DataTypes_Operators;

import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {

//write a Java program to get a number from user & print whether its positive or negative

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = sc.nextInt();
        if (i>=0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
//write a Java program to find greatest of 3 numbers

        Scanner a = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int i1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int i2 = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the third number: ");
        int i3 = c.nextInt();

        if(i1>i2 && i1>i3){
            System.out.println("The largest number is: "+i1);
        }
        else if(i2>i1 && i2>i3){
            System.out.println("The largest number is: "+i2);
        }
        else if(i3>i1 && i3>i2){
            System.out.println("The largest number is: "+i3);
        }
        else {
            System.out.println("All numbers are equal");
        }
// Write multiplication table of 5

        Scanner d = new Scanner(System.in);
        System.out.println("Enter the number for which multiplication table to be made: ");
        int i4 = d.nextInt();
        int i5;
        int result;

        for(i5=1;i5<=10;i5++){
            result=i4*i5;
            System.out.println(i4+" X "+i5+" = "+result);
        }
//Write a Java program to count number of digits of a number

        Scanner e = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i6 = e.nextInt();
        int count =0;
        while (i6>0){
            i6=i6/10;
            count=count+1;
        }
        System.out.println("The number of digits are "+count);


    }
}
