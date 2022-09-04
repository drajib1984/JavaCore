package JavaStreams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicycle","train","flight");
        List<String> uppercase= new ArrayList<>();
//Covert into upper case by stream

        System.out.println(vehicles.stream().map(i -> i.toUpperCase()).collect(Collectors.toList()));

//convert to upper case by for loop
        for(String s:vehicles){
            uppercase.add(s.toUpperCase());
        }
        System.out.println(uppercase);

//print the length of each words in collection

        vehicles.stream().map(i->i.length()).forEach(i-> System.out.println(i));
        System.out.println(vehicles.stream().map(i -> i.length()).collect(Collectors.toList()));

        for (String s:vehicles){
            System.out.println(s.length());
        }

        List<Integer> num_list=Arrays.asList(2,3,4,5,6,7,8,9);
        List<Integer> num_multply= new ArrayList<>();
//multiply by 3 and store

        System.out.println(num_list.stream().map(i -> i * 3).collect(Collectors.toList()));

        for (int a:num_list){
           num_multply.add(a*3);
        }

        System.out.println(num_multply);


    }
}
