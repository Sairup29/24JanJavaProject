package constructor;

public class ConstructorStudy {

    int a;
    int b;

    public ConstructorStudy()
    {

        a=30;
        b=40;
        System.out.println(a);
        System.out.println(b);
    }

    ConstructorStudy(int c)
    {
        a=50;
        b=60;
    }





    //constructor


    public void m1()
    {
        System.out.println("method m1");

        System.out.println(a);
        System.out.println(b);
    }


//    public ConstructorStudy()
//    {
//
//        a=30;
//        b=40;
////        System.out.println(a);
////        System.out.println(b);
//
//   }
//
//
//   public ConstructorStudy(char f )
//    {
//
//    }


    public static void main(String[] args) {

//        ConstructorStudy constructorStudy= new ConstructorStudy();
        ConstructorStudy constructorStudy1= new ConstructorStudy(20);

        constructorStudy1.m1();
//        ConstructorStudy obj3 =new ConstructorStudy('p');
//
//        System.out.println(obj3.a);
//        System.out.println(obj3.b);





    }


}
