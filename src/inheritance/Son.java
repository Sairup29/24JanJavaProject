package inheritance;

public class Son extends Mother{

    int c=30;
    static int d=40;

    public void m3()
    {
        System.out.println("method 3 of son class");
    }

    public static void m4 ()
    {
        System.out.println("method 4 of son class");
    }

    public static void main(String[] args) {

        //normal call
        System.out.println(Mother.b);
           Mother.m2();

        Mother obj1= new Mother();
        System.out.println(obj1.a);
         obj1.m1();

        System.out.println(d);

        Son obj2 = new Son();

        obj2.m1(); //Inheritance call







    }
}
