package methods;

public class MethodStudy {

    //static method
    public static void method1()
    {
        System.out.println("static method from same class");
    }

    //non-static method
    public void method2 ()
    {
        System.out.println("non static method from same class");
    }


    public static void main(String[] args) {
        //static method calling from same class
//        method1();

        //non-static method calling from same class
        MethodStudy obj1 = new MethodStudy();
        obj1.method2();

        //static method calling from another class
//        MethodStudy1.method3();


        //non-static method calling from another class
//        MethodStudy1 obj2 = new MethodStudy1();
//        obj2.method4();
    }
}
