package Method;

interface Taxi{
    public void bookLyft(String source, String destination);
}

interface Taxi1{
    public String bookUber(String source, String destination, int fare);
}



public class Practice2 {
    public static void main(String[] args) {

        Taxi taxi = (source, destination)-> System.out.println("Lyft cab is booked from "+source+" to "+destination);
        taxi.bookLyft("Toronto","Brampton");

        Taxi1 taxi1=(String source, String destination, int fare)-> {System.out.println("Uber cab is booked from "
                +source+" to "+destination);return("Fare is "+ fare);};
        System.out.println(taxi1.bookUber("Scarborough", "Mississauga", 255));

    }
}
