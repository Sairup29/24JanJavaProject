package AbstractClass;

public  class Show extends Test  {


    public void d3() {
        System.out.println( "d3 method");
    }

    public static void main(String[] args) {
        Show  s= new Show();
        s.d1();
        s.d2();
        s.d3();
    }

}
