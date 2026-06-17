package collection;

import javax.sql.XADataSource;
import java.util.Enumeration;
import java.util.Vector;

public class VectorStudy {

    public static void main(String[] args) {

        Vector<Object> x= new Vector<>();
        x.add("Demo");
        x.add(10);
        x.add('p');
        x.add(true);
        x.add(null);

        System.out.println(x);

        x.add(1,30);
        System.out.println(x);

        x.addElement(10);
        System.out.println(x);


        System.out.println( x.elementAt(2));
        System.out.println(x);

        System.out.println(x.firstElement());

        x.insertElementAt("sai",3);
        System.out.println(x);

        Enumeration<Object> z = x.elements();

        while(z.hasMoreElements())
        {
            System.out.println( z.nextElement());
        }






    }
}
