package Method;

public class Practices {
    int x =10;
    int y = 20;

//not taking parameters also not returning value
    void sum(){
        System.out.println(x+y);
    }
//not taking parameters but returning value

    int sum1(){
        return (x+y);
    }
// taking parameters but not returning value

    void sum2(int a,int b){
        System.out.println(a+b);
    }

// taking parameters and returning value
    int sum3(int c, int d){
        return (c+d);
    }

    public static void main(String[] args) {
        Practices pp = new Practices();
        pp.sum();
        System.out.println(pp.sum1());
        pp.sum2(5,8);
        System.out.println(pp.sum3(3, 7));
    }

}
