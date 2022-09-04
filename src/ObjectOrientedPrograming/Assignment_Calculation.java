package ObjectOrientedPrograming;

public class Assignment_Calculation {
    int x;
    int y ;
    int z ;

    public Assignment_Calculation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    int sum(){
        return (x+y+z);
    }

    public static void main(String[] args) {
        Assignment_Calculation ac = new Assignment_Calculation(100,200,300);
        System.out.println(ac.sum());

    }
}
