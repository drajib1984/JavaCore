package LambdaExpressions.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String employeeName;
    int employeeSalary;
    String employeeGender;

    public Employee(String employeeName, int employeeSalary, String employeeGender) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeGender = employeeGender;
    }
}

public class Practice {
    public static void main(String[] args) {
        Consumer<String> consumer = i -> System.out.println(i);
        consumer.accept("Rajib");

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Rajib", 50000, "Male"));
        employees.add(new Employee("John", 30000, "Male"));
        employees.add(new Employee("Mary", 20000, "Female"));
        employees.add(new Employee("Scott", 60000, "Male"));

        for (Employee e : employees) {
            System.out.println(e.employeeName + "--" + e.employeeSalary + "--" + e.employeeGender);
        }
        //Function
        Function<Employee, Integer> function = i -> {
            return i.employeeSalary * 10 / 100;
        };


        //Predicate
        Predicate<Integer> predicate = p -> p >= 5000;
        //consumer
        Consumer<Employee> consumer1 = i -> {
            System.out.println("Name:" + i.employeeName +
                    "  Salary:" + i.employeeSalary + "  Gender:" + i.employeeGender);
        };

        for (Employee e:employees){
            Integer bonus = function.apply(e);
            if(predicate.test(bonus)){
                consumer1.accept(e);
                System.out.println("Employee Bonus:"+bonus+" Name:"+e.employeeName);
            }
        }
    }
}


