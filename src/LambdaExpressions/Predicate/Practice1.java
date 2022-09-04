package LambdaExpressions.Predicate;

import java.util.function.Predicate;

public class Practice1 {

    public static void main(String[] args) {

        Predicate<Integer> predicate=i->i>20;
        System.out.println(predicate.test(25));
        System.out.println(predicate.test(19));


        Predicate<String> predicate1=i->i.length()>=4;
        System.out.println(predicate1.test("Raj"));
        System.out.println(predicate1.test("Rajib"));

// find the names having length more than 4 in an array
        String arr []={"David","Scott","Smith","John","Mary"};

        Predicate<String> predicate2=i->i.length()>4;

        for(String s:arr){
            if(predicate2.test(s)){
                System.out.println(s);
            }
        }


    }
}
