package collection;

import java.util.LinkedList;

public class LinkedListStudy {

    public static void main(String[] args) {
        LinkedList<Integer> x= new LinkedList<>();

        x.add(100);
        x.add(200);
        System.out.println(x);

        x.addFirst(10);
        System.out.println(x);
        x.element();
        System.out.println(x.element());
        x.offer(10);
        System.out.println(x.offer(100));

        x.peek();
        System.out.println(x.peek());

        x.poll();
        System.out.println(x.poll());
        System.out.println(x.poll());

        System.out.println(x);

        System.out.println(x.poll());
        System.out.println(x.pop());


//        x.pop();
//        System.out.println(x.pop());
//        System.out.println(x);
//
//        x.push(20);
//        System.out.println(x);




    }
}
