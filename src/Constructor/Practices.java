package Constructor;

public class Practices {
    int x =100;
    int y =200;

    public Practices() {
    }

    public Practices(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        Practices p1 = new Practices();
       p1.display();

       Practices p2 = new Practices(100,300);
       p2.display();
    }
}
