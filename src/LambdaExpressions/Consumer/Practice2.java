package LambdaExpressions.Consumer;

import java.util.function.Consumer;

public class Practice2 {
    public static void main(String[] args) {
        Consumer<String> c1=c-> System.out.println(c+" is white");
        Consumer<String> c2=c-> System.out.println(c+" has four legs");
        Consumer<String> c3=c-> System.out.println(c+" is eating grass");

        c1.accept("Cow");
        c2.accept("Cow");
        c3.accept("Cow");
 //chaining the consumer
        c1.andThen(c2).andThen(c3).accept("Goat");

    }
}
