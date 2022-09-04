package ObjectOrientedPrograming;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();   //assign values using reference variable emp1
        e1.id = 100;
        e1.name = "Rajib";
        e1.salary = 25000.00;
        e1.deptName = "Sales";
        e1.jobRole = "Manager";
        e1.display();

        Employee e2 = new Employee(); //assign values by calling method
        e2.getValues(101,"Amit",55000.00,"Marketing","CEO");
        e2.display();
    }
}
