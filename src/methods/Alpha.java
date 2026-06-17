package methods;

public class Alpha {

    void m1() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    void m2(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    int m3(int a, int b) {
        int c = a + b;
        return c;
    }


     String m4(String a) {

        return a;
    }

    public static void main(String[] args) {

        Alpha a = new Alpha();
        a.m1();

        a.m2(10, 20);

        int c= a.m3(10, 40);
        System.out.println(c);

         c=a.m3(c, 30);
        System.out.println(c);




//        System.out.println();
//        System.out.println(a.m3(10, 40));

        String p=a.m4("sai");
        System.out.println(p);




    }
}
