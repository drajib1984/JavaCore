package Collection.LinkedList;

import java.util.*;

public class Practices {
    public static void main(String[] args) {

        List list = new LinkedList();

        LinkedList linkedList = new LinkedList();

        LinkedList<String> stringLinkedList = new LinkedList<String>();

        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();

//add elements to linked list
        list.add("Rajib");
        list.add(10.5);
        list.add("Anwar");
        list.add('A');
        list.add(12457);

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.remove(4));
        System.out.println(list);
        list.remove(10.5);
        System.out.println(list);

        list.add(2,'N');
        list.add(0,"Ranjit");
        System.out.println(list);

        System.out.println(list.get(4));

        list.set(4,"Ira Das");
        System.out.println(list);
        list.set(3,"Ananya");
        System.out.println(list);

        System.out.println(list.contains("Ira Das"));
        System.out.println(list.contains("Python"));

        System.out.println(list.isEmpty());

        for(Object o:list){
            System.out.println(o);
        }

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        linkedList.add("asdadadd");
        linkedList.add("woewfwcc");
        linkedList.add("ndwefffsf");
        linkedList.add("lddwffsds");

        list.addAll(1,linkedList);
        System.out.println(list);
        list.removeAll(linkedList);
        System.out.println(list);
//sorting

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list,new Random());
        System.out.println(list);


    }
}
