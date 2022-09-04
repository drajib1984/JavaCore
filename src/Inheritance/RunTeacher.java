package Inheritance;

public class RunTeacher {
    public static void main(String[] args) {
        ComputerTeacher ct = new ComputerTeacher();
        System.out.println(ct.collegeName);
        System.out.println(ct.designation);
        ct.does();
        ct.callTeacher();
    }
}
