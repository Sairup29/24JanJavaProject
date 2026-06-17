package inheritance;
public class Beta extends Alpha  {

    public void b1()
    {
        System.out.println("non static of beta");
    }
    public static void b2()
    {
        System.out.println("static of beta");
    }


    public static void main(String[] args) {
        Alpha obj2= new Alpha();
        Beta x= new Beta();
        x.b1();


    }
}
