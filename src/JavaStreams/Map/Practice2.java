package JavaStreams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList
                (new Employee(101,"Alex",10000),
                        new Employee(102,"Brian",20000),
                        new Employee(103,"Charles",30000),
                        new Employee(104,"David",40000),
                        new Employee(105,"Edward",50000));


        employees.stream().forEach(i-> System.out.println(i.empId+"--"+i.empName+"--"+i.empSalary));

// salaries >20K

      employees.stream().filter(i -> i.empSalary > 20000).forEach(i-> System.out.println(i.empSalary));
        System.out.println(employees.stream().filter(i -> i.empSalary > 20000).map(i -> i.empSalary).collect(Collectors.toList()));

      for (Employee e:employees) {
          if(e.empSalary>20000){
              System.out.println(e.empSalary);
          }
      }



    }

}
