package thisAndSuper;

public class Demo {
    int a=10;
    static int b=20;

    public void d1()
    {
        int a=30;
        int b=40;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(Demo.b);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.d1();
    }
}
