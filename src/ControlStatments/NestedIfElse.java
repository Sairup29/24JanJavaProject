package ControlStatments;



public class NestedIfElse {

    public static void main(String[] args) {

        String username="sairup";
        String pass ="sai@123";

        if(username=="sairup")
        {
            System.out.println("username is correct enter the pass");
            if(pass=="sai@123")
            {
                System.out.println(" pass is correct , login successful");
            }
            else
            {
                System.out.println("password is incorrect");
            }
        }
        else
        {
            System.out.println("username is incorrect");
        }











        //compare 3 numbers which is greater
        //comparing 3 numbers which is greater
        int a=5;
        int b=10;
        int c=50;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("the greater num is "+a);
            }
            else
            {
                System.out.println("the greater num is "+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("greater num is "+b);
            }
            else
            {
                System.out.println("greater number is "+c);
            }
       }






    }
}
