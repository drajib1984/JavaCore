package JavaStreams.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String studentName;
    int studentId;
    char studentGrade;

    public Student(String studentName, int studentId, char studentGrade) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentGrade = studentGrade;
    }
}
public class Practice2 {
    public static void main(String[] args) {
        List<Student> studentList1 = Arrays.asList
                (new Student("Smith",101,'A'),
                new Student("John",102,'B'),
                new Student("Kennedy",103,'C'));

        List<Student> studentList2 = Arrays.asList
                (new Student("Scott",104,'A'),
                        new Student("Mary",105,'B'),
                        new Student("Kitty",106,'C'));

        List<List<Student>> finalStudentList=Arrays.asList(studentList1,studentList2);

       finalStudentList.stream().flatMap(x -> x.stream()).forEach(i-> System.out.println(i.studentName+"--"+i.studentId+"--"+i.studentGrade));
        System.out.println(finalStudentList.stream().flatMap(x -> x.stream()).map(i -> i.studentName).collect(Collectors.toList()));
        for (List<Student> a:finalStudentList){
           for(Student obj:a){
               System.out.println(obj.studentName+"--"+obj.studentId+"--"+obj.studentGrade);
           }
       }
    }

}
