package JavaStreams.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList= new ArrayList<Integer>();
        integerArrayList.add(25);
        integerArrayList.add(30);
        integerArrayList.add(45);
        integerArrayList.add(50);
        integerArrayList.add(65);

        List<Integer> integerArrayList1= Arrays.asList(12,15,83,46,2,71,76);

        List<Integer>evenNumberList=new ArrayList<Integer>();

 // find the even numbers - using for loop

        for (int a:integerArrayList1){
           if(a%2==0){
               evenNumberList.add(a);
           }
        }
        System.out.println(evenNumberList);

        // find the even numbers - using for streams

        System.out.println(integerArrayList1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
        integerArrayList.stream().filter(i->i%2==0).forEach(n-> System.out.println(n));


        List<String> names= Arrays.asList("Melisandre","Sansa","Jon","Joffery","Daenerys");
//filter the names greater than 5 & less than 8
        System.out.println(names.stream().filter(n->n.length()>4 && n.length()< 8).collect(Collectors.toList()));
        names.stream().filter(n->n.length()>=4 && n.length()<=8).forEach(System.out::println);

        List<String> words = Arrays.asList("cup", null,"forest","sky","book",null,"theatre");
//remove null
        System.out.println(words.stream().filter(n -> n != null).collect(Collectors.toList()));

    }
}
