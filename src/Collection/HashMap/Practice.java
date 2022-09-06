package Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap(); //generic declaration not used

        HashMap<Integer,String> hashMap1 = new HashMap<Integer,String>();
// add key,value to Hashmap
        hashMap1.put(101,"John");
        hashMap1.put(102,"David");
        hashMap1.put(103,"Haris");
        hashMap1.put(104,"Carl");
        hashMap1.put(101,"Philip");// no duplicate key alloweed, in this case old value will be replaced
        hashMap1.put(105,"Carl"); //duplicate values allowed
        System.out.println(hashMap1);

        System.out.println(hashMap1.get(101));

        System.out.println(hashMap1.containsKey(101));
        System.out.println(hashMap1.containsKey(109));

        System.out.println(hashMap1.containsValue("Carl"));
        System.out.println(hashMap1.containsValue("Raj"));

        System.out.println(hashMap1.isEmpty());

        System.out.println(hashMap1.keySet());

        System.out.println(hashMap1.values());

        hashMap1.remove(103);
        System.out.println(hashMap1);

        System.out.println(hashMap1.entrySet());

// Reading pairs using for loop
        for(Map.Entry m:hashMap1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        for(int i:hashMap1.keySet()){
            System.out.println(i+"----"+hashMap1.get(i));
        }

        Set ss = hashMap1.entrySet();
        Iterator iterator =ss.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



// Reading keys using for loop
        for (int i :hashMap1.keySet()){
            System.out.println(i);
        }
// Reading keys using for loop
        for(String s:hashMap1.values()){
            System.out.println(s);
        }

    }
}
