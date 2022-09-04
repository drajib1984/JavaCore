package LambdaExpressions.Functions;

import java.util.function.Function;

public class Practice {
    public static void main(String[] args) {
        Function<Integer, Integer> function = i -> i * i;
        System.out.println(function.apply(5));
        System.out.println(function.apply(4));

//String length
        Function<String,Integer> function1=i->i.length();
        System.out.println(function1.apply("rajib"));
        Integer integer = function1.apply("Java");
        System.out.println(integer);
    }
}
