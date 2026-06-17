package thisAndSuper;

public class Test extends Demo {

    int a=50;

    public void t1()
    {
        int a=60;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {

        Test obj1= new Test();
//        obj1.d1();
        obj1.t1();

    }
}
