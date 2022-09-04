package JavaControlStatements;

import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
//Conditional Statements (if-else)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int i = sc.nextInt();

        if(i>=18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }

// nested if-else statement

        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the day number: ");
        int i1 = ab.nextInt();

        if(i1==1){
            System.out.println("Today is Sunday");
        } else if (i1==2) {
            System.out.println("Today is Monday");
        } else if (i1==3) {
            System.out.println("Today is Tuesday");
        } else if (i1==4) {
            System.out.println("Today is Wednesday");
        } else if (i1==5) {
            System.out.println("Today is Thursday");
        } else if (i1==6) {
            System.out.println("Today is Friday");
        } else if (i1==7) {
            System.out.println("Today is Saturday");
        }
        else {
            System.out.println("Wrong Day number");
        }

// switch - case statement
        Scanner bc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int i2 = bc.nextInt();
        switch (i2){
            case 1 :
                System.out.println("January");break;
            case 2 :
                System.out.println("February");break;
            case 3:
                System.out.println("march");break;
            case 4:
                System.out.println("April");break;
            case 5:
                System.out.println("May");break;
            case 6:
                System.out.println("June");break;
            case 7:
                System.out.println("July");break;
            case 8:
                System.out.println("Aug");break;
            case 9:
                System.out.println("Sep");break;
            case 10:
                System.out.println("Oct");break;
            case 11:
                System.out.println("Nov");break;
            case 12:
                System.out.println("Dec");break;
            default:
                System.out.println("Wrong entry");

        }

// while statement - Create a series from 1 to 20

        int a = 1;

        while (a<=20){
            System.out.println(a);
            a++;
        }
// do-while statement - Create a series from 20 to 1

        int b = 20;
        do {
            System.out.println(b);
            b--;
        }while (b>=1);
// for loop statement - Create a series from 20 to 1

        int c =1;
        for(c =1;c<=10;c++){
            System.out.println(c);
        }

// jump statement - break

        int d =10;

        for(d=10;d>=1;d--){
            if(d==5){
                break;
            }
            System.out.println(d);
        }

        int e = 1;

        for(e=1;e<=10;e++){
            if (e==5){
                continue;
            }
            System.out.println(e);
        }

    }
}
