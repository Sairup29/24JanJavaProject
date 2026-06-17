package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetStudy {
    public static void main(String[] args) {

        LinkedHashSet<Object> x= new LinkedHashSet<>();

        // insertion order is followed

        x.add(10);
        x.add("velocity");
        x.add('a');
        x.add(null);
        x.add(10);
        x.add(null);
        System.out.println(x);


    }
}
