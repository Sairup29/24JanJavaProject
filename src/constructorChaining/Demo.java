package constructorChaining;

public class Demo {

    public Demo()
    {
//        this(10);
        System.out.println("without parameter");
    }

    public Demo(int p)
    {
//      this('k');
        System.out.println("with integer parameter");
    }

    public Demo(char q)
    {
        System.out.println("with char parameter");
    }

    public static void main(String[] args) {
       Demo obj1 = new Demo();
   }
}
