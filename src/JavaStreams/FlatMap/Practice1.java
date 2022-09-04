package JavaStreams.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,3,4);
        List<Integer> list2 = Arrays.asList(5,6,7);
        List<Integer> list3 = Arrays.asList(8,9,10);
        List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);

        System.out.println(finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList()));
//find numbrs >6
        finalList.stream().flatMap(x -> x.stream()).filter(n -> n > 6).forEach(n-> System.out.println(n));

        List<String> teamA=Arrays.asList("Scott","David","John");
        List<String> teamB=Arrays.asList("Mary","Luna","Tom");
        List<String> teamC=Arrays.asList("Ken","John","Kitty");

        List<List<String>> allPlayers=Arrays.asList(teamA,teamB,teamC);

        allPlayers.stream().flatMap(x->x.stream()).forEach(i-> System.out.println(i));
        System.out.println(allPlayers.stream().flatMap(x -> x.stream()).collect(Collectors.toList()));

        for (List<String> team:allPlayers){
            for (String s:team){
                System.out.println(s);
            }
        }
    }
}
