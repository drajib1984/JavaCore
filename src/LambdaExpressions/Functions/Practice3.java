package LambdaExpressions.Functions;

import java.util.function.Function;

public class Practice3 {
    public static void main(String[] args) {
//andThen()  compose() in function interface
        Function<Integer,Integer> f1 = n->n*2;
        Function<Integer,Integer> f2 = n->n*n*n;

        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));
    }
}
