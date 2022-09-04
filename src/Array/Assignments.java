package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
//Write a Java prgram to calculate the sum values of an array

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);

//Write a Java program to search a specific number in an array

        int b[] = {100, 200, 300, 400, 500};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked in the array: ");
        int input = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < b.length; i++) {
            if (b[i] == input) {
                System.out.println(input + " present");
                found = true;
            }
        }
            if(found==false) {
                System.out.println(input+" not present");
            }



//Define an array with some string values,write a java program to find specific string

        String[] s={"RAJIB","EATS","APPLE"};
        String next = "EATS";
        boolean found_string = false;
        for(int i=0;i<s.length;i++){
            if(s[i]==next){
                System.out.println(next+" is present");
                found_string=true;
            }
        }
        if(found_string==false){
              System.out.println(next+" NOT present");
        }

//write a java program to print even and odd numbers in an array

        int aa[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Even numbers are: ");
        for(int i = 0;i<aa.length;i++){
            if(aa[i]%2==0){
                System.out.println(aa[i]);
            }
        }
        System.out.println("Odd numbers are: ");
        for(int i = 0;i<aa.length;i++){
            if(aa[i]%2!=0){
                System.out.println(aa[i]);
            }
        }
//Write a java program to find the largest and smallest number in an array

        int ab[]={55,32,45,98,82,11,9,39,50};
        int largest=ab[0];
        int smallest=ab[0];
        for(int i=0;i<ab.length;i++) {
            if (ab[i] > largest) {
                largest = ab[i];
            } else if (ab[i] < smallest) {
                smallest = ab[i];
            }
        }
        System.out.println("the largest number is: " + largest);
        System.out.println("the smallest number is: "+smallest);

        int x[][]={{10,11,12},{13,14,15},{16,17,18}};
        int y[][]={{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        int z[][]=new int[3][3];

        for(int i=0;i<x.length;i++){
            for(int j =0;j<x[i].length;j++){
                z[i][j]=x[i][j]+y[i][j];
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }



    }

}
