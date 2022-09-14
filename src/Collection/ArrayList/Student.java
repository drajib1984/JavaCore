package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student {
    String firstName;
    String lastName ;
    int age;
    String email;

    public Student(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Peter","Parker",25,"peter@gmail.com"),
                new Student("tony","Stark",10,"tony@gmail.com"),
                new Student("Bat","man",12,"batman@gmail.com"),
                new Student("Robin","hood",50,"robin@gmail.com"),
                new Student("Super","man",34,"superman@gmail.com")
        );

        List<Student> collect = studentList.stream().filter(i -> i.age > 10).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println(studentList.stream().map(i -> i.age + 2).collect(Collectors.toList()));


    }


}
