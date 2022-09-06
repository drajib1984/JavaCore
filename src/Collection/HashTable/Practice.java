package Collection.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable(); //default capacity 11, load factor=0.75
        Hashtable hashtable1 = new Hashtable(25, (float) 0.99);//new capacity & load factor
        Hashtable<Integer, String> integerStringHashtable = new Hashtable<Integer, String>(100, (float) .99);

        integerStringHashtable.put(101,"David");
        integerStringHashtable.put(102,"John");
        integerStringHashtable.put(103,"Melvin");
        integerStringHashtable.put(104,"Ford");
        integerStringHashtable.put(105,"David"); // no null in key or value
        System.out.println(integerStringHashtable);

        System.out.println(integerStringHashtable.get(104));

        integerStringHashtable.remove(104);
        System.out.println(integerStringHashtable);

        System.out.println(integerStringHashtable.containsValue("Davis"));
        System.out.println(integerStringHashtable.containsKey(105));

        System.out.println(integerStringHashtable.isEmpty());

        System.out.println(integerStringHashtable.keySet());

        System.out.println(integerStringHashtable.values());

        for (int i:integerStringHashtable.keySet()){
            System.out.println(i);
        }

        for(String s:integerStringHashtable.values()){
            System.out.println(s);
        }

        for(Map.Entry m:integerStringHashtable.entrySet()){
            System.out.println(m.getKey()+"--"+m.getValue());
        }
        Set s = integerStringHashtable.entrySet();
        Iterator iterator = s.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
