package collection;

import java.util.ArrayList;

//collection i - extends list i - implements arraylist ic

public class ArrayListStudy {

    public static void main(String[] args) {

        //ClassName objectname= new classname();
        ArrayList<String> a= new ArrayList<>();

        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");

        System.out.println(a);

        a.add(2,"f");
        System.out.println(a);

        a.addFirst("g");
        System.out.println(a);

        a.addLast("h");
        System.out.println(a);

//        a.clear();
//
//        System.out.println(a);

        Object k=a.clone();

        System.out.println(k);

        boolean z=a.contains("h");
        System.out.println(z);

        System.out.println(a.equals(k));

        System.out.println( a.get(2));

        System.out.println(a.indexOf("c"));

        System.out.println( a.remove(3));
        System.out.println(a);

        System.out.println(a.set(2,"i"));
        System.out.println(a);














    }
}
