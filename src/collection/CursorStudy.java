package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorStudy {

    public static void main(String[] args) {

        ArrayList<Integer> x= new ArrayList<>();

        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        x.add(50);
        x.add(60);

        System.out.println(x);
//
//        for(int i=0; i<=x.size()-1; i++)
//        {
//            System.out.println( x.get(i));
//        }
//
//        System.out.println("=============================");
//
//        for(Integer y:x)
//        {
//            System.out.println(y);
//        }

        Iterator<Integer> it =x.iterator();  // remove
//
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

//        it.next();
//        it.next();
//        it.remove();
//        System.out.println(x);


//        System.out.println("===============================");



       ListIterator<Integer> lit=x.listIterator();

//        while(lit.hasNext())
//        {
//            System.out.println(lit.next());
//        }
//
//
//        while(lit.hasPrevious())
//        {
//            System.out.println(lit.previous());
//        }
//        lit.next();
//        lit.remove();
//        System.out.println(x);

//        lit.next();
//        lit.set(100);
//        System.out.println(x);

        lit.add(400);
        System.out.println(x);



    }
}
