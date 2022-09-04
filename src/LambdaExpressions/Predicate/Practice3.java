package LambdaExpressions.Predicate;

import java.util.function.Predicate;

public class Practice3 {
// one prdicate to cheeck if number is even
//one more preedicate to chekc number>50
// joining predicates - and or negate. Negate means opposite

    public static void main(String[] args) {

        int arr []={5,10,15,20,25,30,35,40,45,50,55,60,65,70};

        Predicate<Integer> p1= i->i%2==0;
        Predicate<Integer> p2=i->i>50;

        for(int x:arr){
            if(p1.test(x)&& p2.test(x)){
                System.out.println(x);
            }
        }

        for(int x:arr){
            if (p1.or(p2).test(x)) //combining 2 predicates with or/and
            {
                System.out.println(x);
            }
        }

        for (int a:arr){
            if (p1.negate().test(a)){
                System.out.println(a);
            }
        }
    }
}
