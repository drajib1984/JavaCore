package LambdaExpressions.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String employeeName;
    int employeeSalary;
    int employeeExperience;

    public Employee(String employeeName, int employeeSalary, int employeeExperience) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeExperience = employeeExperience;
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Rajib",52000,4);
//check if employee salary >50K and experience >3 yrs
        Predicate<Employee> employeePredicate=e->(e.employeeSalary>29000 && e.employeeExperience>3);
        System.out.println(employeePredicate.test(employee));

        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        employeeArrayList.add(new Employee("John",50000,5));
        employeeArrayList.add(new Employee("David",20000,2));
        employeeArrayList.add(new Employee("Scott",30000,3));
        employeeArrayList.add(new Employee("Mary",40000,6));

        for (Employee object:employeeArrayList){
            System.out.println("Name:"+object.employeeName+"   Experience:"+object.employeeExperience+
                    "   Salary:"+object.employeeSalary);
        }

        for (Employee object:employeeArrayList){
            if(employeePredicate.test(object)){
                System.out.println("Name:"+object.employeeName + "  Salary:" + object.employeeSalary
                        +"  Experience:"+object.employeeExperience);
            }
        }

    }
}
