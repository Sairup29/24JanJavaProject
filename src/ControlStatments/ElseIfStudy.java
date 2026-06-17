package ControlStatments;

public class ElseIfStudy {

    public static void main(String[] args) {

        //elseIf is used when we have to check multipal conditions

        // only one condition will be executed for conditional statements

        int marks=20;

        if(marks>=70)
        {
            System.out.println("distinction");
        }

        else if(marks>=50)
        {
            System.out.println("first class");
        }

        else if(marks>=40)
        {
            System.out.println("pass");
        }

        else
        {
            System.out.println("fail");
        }



    }
}
