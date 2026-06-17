package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {
    public static void main(String[] args) {
        HashSet<Integer> x=new HashSet<>();
        //duplicates no allowed
        //insertion order is not followed
        //only one null allowed
        //indexing is not present

        x.add(10);
        x.add(20);
        x.add(20);
        x.add(null);
        x.add(null);
        System.out.println(x);


        Iterator <Integer>it = x.iterator();
        it.next();
        int s=it.next();
        System.out.println(s);



    }
}
