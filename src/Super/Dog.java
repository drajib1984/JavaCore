package Super;

public class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("Dog created");
    }

    String color = "black";

    void  displayColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

    @Override
    void eating() {
        super.eating();
        System.out.println("Eating bread");
    }
}
