package LambdaExpressions.Functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String employeeName;
    int employeeSalary;

    public Employee(String employeeName, int employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
}
public class Practice2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("ranjit",50000));
        employees.add(new Employee("david",20000));
        employees.add(new Employee("john",30000));
        employees.add(new Employee("mary",60000));

        for (Employee employee:employees){
            System.out.println(employee.employeeName+" "+employee.employeeSalary);
        }

// Calculate the bonus 10-20K=10%; 20-30K=20%, 30-40K=30%, rest 40%

        Function<Employee,Integer> function=i->{
          int sal = i.employeeSalary;
          if (sal>=10000 && sal<=20000){
              return sal*10/100;
          }
            else if (sal>=20000 && sal<=30000){
                return sal*20/100;
            }
          else if (sal>=30000 && sal<=40000){
              return sal*30/100;
          }
          else {
              return sal*40/100;
          }

        };

        for (Employee employee:employees){
            double bonus = function.apply(employee);
            System.out.println("Name:"+employee.employeeName+" Salary:"+employee.employeeSalary+" Bonus:"+bonus);
        }
//Adding a predicatee method
        System.out.println("Adding predicate method");
        Predicate<Integer> predicate= i->i>6000;

        for (Employee e:employees){
            Integer bonus = function.apply(e);
            if(predicate.test(bonus)){
                System.out.println("Name:"+e.employeeName+" Salary:"+e.employeeSalary+" Bonus:"+bonus);
            }

        }




    }

}
