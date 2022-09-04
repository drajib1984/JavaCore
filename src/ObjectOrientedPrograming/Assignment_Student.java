package ObjectOrientedPrograming;

public class Assignment_Student {
    int student_id;
    String student_name;
    int sub1_marks;
    int sub2_marks;
    int sub3_marks;

    void display(){
        System.out.println(student_id);
        System.out.println(student_name);
    }

    void getStuData(int id,String name){
        student_id=id;
        student_name=name;
    }

    void getStuMarks(int sub1,int sub2,int sub3){
        System.out.println("Marks for Sub1 is: "+(sub1_marks=sub1)
                +" Marks for Sub2 is: "+(sub2_marks=sub2)
                +" Marks for Sub3 is: "+(sub3_marks=sub3));
    }

    void totalMarks(int sub1_marks,int sub2_marks,int sub3_marks){
        System.out.println("Total Marks is: "+(sub1_marks+sub2_marks+sub3_marks));
    }

    public static void main(String[] args) {
        Assignment_Student as = new Assignment_Student();
        as.getStuData(100,"Rajib");
        as.display();
        Assignment_Student as1 = new Assignment_Student();
        as1.getStuMarks(50,70,88);
        Assignment_Student as2 = new Assignment_Student();
        as2.totalMarks(50,55,65);

    }
}
