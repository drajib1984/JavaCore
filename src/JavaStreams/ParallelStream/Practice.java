package JavaStreams.ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
public class Practice {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("David",82),
                new Student("John",95),
                new Student("Bob",65),
                new Student("Kennedy",55),
                new Student("Eric",85),
                new Student("Smith",88),
                new Student("Scott",55)
        );

        studentList.parallelStream().filter(i->i.score>60).forEach(i-> System.out.println(i.name+"--"+i.score));

        studentList.stream().parallel().filter(i->i.score>60).forEach(i-> System.out.println(i.name+"--"+i.score));

    }
}
