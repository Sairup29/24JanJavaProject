package inheritance;

public class Delhi {
    public static void main(String[] args) {

          Mumbai obj1= new Mumbai();
          obj1.p1();
          obj1.m1();
        Mumbai.p2();
        Mumbai.m2();

        Hyderabad obj2= new Hyderabad();
        obj2.p1();
        obj2.h1();
        Hyderabad.p2();
        Hyderabad.h2();
    }
}
