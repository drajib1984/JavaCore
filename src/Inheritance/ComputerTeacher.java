package Inheritance;

public class ComputerTeacher extends Teacher {
    String designation="ComputerTeacher";
    String collegeName="ComputerBook";

    public ComputerTeacher() {
        super();
        System.out.println("Computer teacher constructor");
    }

    @Override
    public void does() {
        System.out.println("Teaching Computer");
    }

    public void callTeacher(){
        System.out.println(super.collegeName);
        System.out.println(super.designation);
    }
}
