package Collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Practice {
    public static void main(String[] args) {
        HashSet hs = new HashSet(); //default capacity 16 and load factor 0.75
        HashSet hashSet = new HashSet(100, (float) 0.99); //initial capacity 100 & load factor 0.99
        HashSet<String> stringHashSet = new HashSet<String>();
        HashSet<Integer> integerHashSet= new HashSet<Integer>();
        HashSet<Integer> integerHashSet1 = new HashSet<Integer>();

        hs.add("Rajib");
        hs.add(12.56);
        hs.add('S');
        hs.add("Ranjit");
        hs.add("Rajib");

        System.out.println(hs); // insertion order not maintained, duplicates not allowed

        hs.remove("Rajib");
        System.out.println(hs);

        System.out.println(hs.contains(12.56));
        System.out.println(hs.contains("Rajib"));

        System.out.println(hs.isEmpty());
//Use advanced for loop to geet all the objects
        for (Object ob:hs){
            System.out.println(ob);
        }
//Use Iterator to get all the objects
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        stringHashSet.add("Rajib");
        stringHashSet.add("Rupam");
        stringHashSet.add("Amrit");
        stringHashSet.add("Rahul");
        stringHashSet.add("Ratan");

        System.out.println(stringHashSet);

        hs.addAll(stringHashSet);
        System.out.println(hs);

        hs.removeAll(stringHashSet);
        System.out.println(hs);

        stringHashSet.addAll(hs);
        System.out.println(stringHashSet);

        stringHashSet.retainAll(hs);
        System.out.println(stringHashSet);

//union, intersection, difference

        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(4);
        integerHashSet.add(5);
        System.out.println(integerHashSet);

        integerHashSet1.add(3);
        integerHashSet1.add(4);
        integerHashSet1.add(5);
        System.out.println(integerHashSet1);
//union
        integerHashSet1.addAll(integerHashSet);
        System.out.println(integerHashSet1);
//intersection
        integerHashSet.retainAll(integerHashSet1);
        System.out.println(integerHashSet);
//difference
        integerHashSet1.removeAll(integerHashSet);
        System.out.println(integerHashSet1);
    }
}
