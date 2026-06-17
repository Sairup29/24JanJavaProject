package methods;

public class MethodWithParameter {


    public static void p1(int a)
    {
        System.out.println("a is "+a);
    }

    public void p2(String b)
    {
        System.out.println("b is "+b);
    }

    public static void student(String name, int RollNo, float Percentage, char Div,boolean Result)
    {
        System.out.println("student name is: "+name);
        System.out.println("percentage is:  "+Percentage);
        System.out.println("result is: "+Result);
        System.out.println(" roll number is: " +RollNo );
        System.out.println("div is: "+Div);
    }

    public static void main(String[] args) {
        //calling static from same
        p1(10);

        //calling non-static from another class
        MethodWithParameter methodWithParameter= new MethodWithParameter();
        methodWithParameter.p2("velocity");

        // calling static method from same
        student("rohit",23,83.4f,'a',true);

    }






}
