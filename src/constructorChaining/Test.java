package constructorChaining;

public class Test extends Demo {

    public Test ()
    {
        super();
        System.out.println("without parameter test class");
    }

   public Test (int c)
    {
//       super('l');

       System.out.println("with int parameter test class");
    }

  public Test (char d)
    {
        System.out.println("with char parameter of test class");
    }

    public static void main(String[] args) {
       Test obj2= new Test(10);



    }

}
