package overloadingAndOveriding;

public class Test extends Demo {

//overriding
    public void d1()
    {
        int a=10;
        System.out.println((a));
    }
    public static void main(String[] args) {
        Test y = new Test();
        y.d1();

        Demo z= new Demo();
        z.d1();
    }
}
