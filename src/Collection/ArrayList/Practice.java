package Collection.ArrayList;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); //generic syntax
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        ArrayList<String> stringArrayList = new ArrayList<String>();

        stringArrayList.add("Rajib");
        stringArrayList.add("Ranjit");
        stringArrayList.add("Ira");
        stringArrayList.add("Ananya");
        stringArrayList.add("Raja");

        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList);

        stringArrayList.remove(0);
        System.out.println(stringArrayList);

        stringArrayList.add(2,"Rajib");
        System.out.println(stringArrayList);
//Use enhanced for loop to check the elements in an arraylist whn datatype of arraylist is same
        for(String s:stringArrayList){
            System.out.println(s);
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



    }
}
