package interfaceStudy;

public interface Sigma  {

    //public final and static
    int a=10;
        //a=20;

   //public and abstract
    void s1();

    default void sample()
    {
        System.out.println("default method");
    }

    static void show()
    {
        System.out.println("static");
    }
}
