package interfaceStudy;

public class Demo implements Sigma {


    @Override
    public void s1()
    {
        System.out.println("abstract method of sigma");
    }

    public void sample()
    {
        System.out.println("default method is override");
    }

    public static void main(String[] args) {
        Demo d= new Demo();
        d.s1();
        d.sample();
        Sigma.show();
    }

}
