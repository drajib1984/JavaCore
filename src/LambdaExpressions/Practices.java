package LambdaExpressions;

@FunctionalInterface
interface Cab{
    public void bookCab();
}

class Ola implements Cab{
    @Override
    public void bookCab() {
        System.out.println("Ola cab booked");
    }
}

class Uber implements Cab{

    @Override
    public void bookCab() {
        System.out.println("Uber cab booked");
    }
}

public class Practices {
    public static void main(String[] args) {
        Cab cab = new Ola(); //loose coupling
        cab.bookCab();

        Cab cab1 = ()-> System.out.println("Uber cab booked by Lambda expression");
        cab1.bookCab();
    }
}
