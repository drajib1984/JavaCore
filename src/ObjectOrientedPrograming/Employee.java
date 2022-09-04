package ObjectOrientedPrograming;

public class Employee {
    int id;
    String name;
    double salary;
    String deptName;
    String jobRole;

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(deptName);
        System.out.println(jobRole);
    }

    void getValues(int eid,String ename,double esalary,String edeptName,String ejobRole){
        id=eid;
        name=ename;
        salary=esalary;
        deptName=edeptName;
        jobRole=ejobRole;
    }
}
