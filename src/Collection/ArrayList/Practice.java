package Collection.ArrayList;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); //generic syntax
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        ArrayList<String> stringArrayList = new ArrayList<String>();
        List list = new ArrayList();

        stringArrayList.add("Rajib");
        stringArrayList.add("Ranjit");
        stringArrayList.add("Ira");
        stringArrayList.add("Ananya");
        stringArrayList.add("Raja");
        stringArrayList.add("Raja"); //duplicate entries allowed in List

        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);

        stringArrayList.remove(0);
        System.out.println(stringArrayList);

        stringArrayList.add(2,"Rajib");
        stringArrayList.add("Rana");
        System.out.println(stringArrayList);

        System.out.println(stringArrayList.get(3));
        stringArrayList.set(5,"Vicky");
        System.out.println(stringArrayList.contains("Ranjit"));
        System.out.println(stringArrayList.contains("Rickey"));
        System.out.println(integerArrayList.isEmpty());
//Use enhanced for loop to check the elements in an arraylist whn datatype of arraylist is same
        for(String s:stringArrayList){
            System.out.println(s);
        }
//Using regular for loop
        for (int i =0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }

        arrayList.add("Rajib");
        arrayList.add("Ranjit");
        arrayList.add("Ira");
        arrayList.add('A');
        arrayList.add(12.5);

        System.out.println(arrayList);

//Use enhanced for loop to check the elements in an arraylist whn datatype of arraylist is different
        for (Object o:arrayList){
            System.out.println(o);
        }
//Using iterator method
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        integerArrayList.add(12);
        integerArrayList.add(26);
        integerArrayList.add(32);
        System.out.println(integerArrayList);
//Using addAll
        arrayList.addAll(integerArrayList);
        System.out.println(arrayList);
        arrayList.removeAll(integerArrayList);
        System.out.println(arrayList);

//Sorting
        Collections.sort(stringArrayList);
        System.out.println(stringArrayList);
        Collections.reverse(stringArrayList);
        System.out.println(stringArrayList);

//shuffling
        Collections.shuffle(stringArrayList);
        System.out.println(stringArrayList);
//arrays to arraylist
        String arr[] ={"Dog","Cat","Elephant"};
        System.out.println(arr);
        ArrayList animal = new ArrayList(Arrays.asList(arr));
        System.out.println(animal);
    }
}
