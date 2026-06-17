package overloadingAndOveriding;

public class Demo {
    //overloading
    public void d1()
    {
        System.out.println("d1 with zero parameter");
    }

    public void d1(int a) {
        System.out.println("d1 with int parameter");
    }

    public void d1(char b) {
        System.out.println("d1 with char parameter");
    }

    public static void main(String[] args) {
        Demo x= new Demo();
        x.d1();
        x.d1(20);
        x.d1('p');
    }

}
