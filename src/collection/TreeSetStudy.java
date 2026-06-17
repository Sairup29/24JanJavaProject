package collection;

import java.util.TreeSet;

public class TreeSetStudy {
    public static void main(String[] args) {

        //allows only same type of data
        //null values no allowed
        //insertion done in ascending order

        TreeSet<Object> x= new TreeSet<>();
        x.add(50);
        x.add(30);
        x.add(40);
        x.add(10);
        System.out.println(x);

        System.out.println(x.ceiling(49));
        System.out.println(x.floor(29));


    }
}
