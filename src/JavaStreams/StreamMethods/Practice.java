package JavaStreams.StreamMethods;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        List<String> vehicleList= Arrays.asList("bus","car","bicycle","bus","car","car","bike");

//distinct elements (Non-terminal methods)
        System.out.println(vehicleList.stream().distinct().collect(Collectors.toList()));
        vehicleList.stream().distinct().forEach(i-> System.out.println(i));
//coount

        System.out.println(vehicleList.stream().count());

//limit
        System.out.println(vehicleList.stream().limit(5).collect(Collectors.toList()));
        vehicleList.stream().limit(5).forEach(i-> System.out.println(i));


        List<Integer> numbList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//count eeven numbers

        System.out.println(numbList.stream().filter(i -> i % 2 == 0).count());

//minimum //min() takes compeartor means two variablees to compare

        Optional<Integer> min = numbList.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(min.get());

//maximum
        Optional<Integer> max = numbList.stream().max((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(max.get());

//reduce

        List<String> stringList = Arrays.asList("A","B","C","D","1","2","3");
        Optional<String> reduce = stringList.stream().reduce((value, combinedvalue) -> {
            return value+combinedvalue;
        });
        System.out.println(reduce.get());


//to Array
        Object[] arr= stringList.stream().toArray();
        System.out.println(arr.length);

        Arrays.stream(arr).forEach(i-> System.out.println(i));
//sorting
        List<Integer> numb_list= Arrays.asList(12,56,1,3,7,5,98,3,4,10);
        System.out.println(numb_list.stream().sorted().collect(Collectors.toList()));
        numb_list.stream().sorted().forEach(i-> System.out.println(i));

//reverse sorting

        System.out.println(numb_list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

//sorting String

        List<String> stringList1 = Arrays.asList("John","Mary","Kim","David","Smith");
        System.out.println(stringList1.stream().sorted().collect(Collectors.toList()));

//reverse sorting string

        System.out.println(stringList1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));



        Set<String> fruits = new HashSet<String>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");
//AnyMatch
        System.out.println(fruits.stream().anyMatch(i -> i.startsWith("One")));
//AllMatch
        System.out.println(fruits.stream().allMatch(i -> i.startsWith("One")));
//none match

        System.out.println(fruits.stream().noneMatch(i -> i.startsWith("One")));

        List<String> stringList2 = Arrays.asList("one","two","three","one");
//findany
        Optional<String> any = stringList2.stream().findAny();
        System.out.println(any.get());
//findfirst
        Optional<String> first = stringList2.stream().findFirst();
        System.out.println(first.get());

        List<String> animalList= Arrays.asList("dog","cat","elephant");
        List<String> birdsList=Arrays.asList("peacock","parrot","crow");

//concatenate
        Stream<String> stream = animalList.stream();
        Stream<String> stream1 = birdsList.stream();

        Stream<String> concat = Stream.concat(stream, stream1);
        System.out.println(concat.collect(Collectors.toList()));

    }
}
