package Collection.LinkedHashSet;

import java.util.LinkedHashSet;

public class Practices {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<Integer>();
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("rajib");
        linkedHashSet.add(1245);
        linkedHashSet.add('A');
        linkedHashSet.add(12.4755);

        System.out.println(linkedHashSet);

    }
}
