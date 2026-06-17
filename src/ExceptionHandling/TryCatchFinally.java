package ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {

        //arithmetic exception

        try {
           int b=10/20;
       }
       catch(ArithmeticException x)
       {
           System.out.println(x);
       }


        String b= null;
       try{
           System.out.println(b.length());
       }
       catch (NullPointerException x)
       {
           System.out.println(x);
       }

      String c="velocity";
       try{
           System.out.println(c.charAt(34));
       }
       catch (StringIndexOutOfBoundsException x)
       {
           System.out.println(x);
       }

       int d []={1,2,3,4};
        try{
//            System.out.println(d[15]);
        }
//        catch (ArrayIndexOutOfBoundsException x)
//        {
//            System.out.println(x);
//        }
        finally
        {
            System.out.println("finally");
        }



    }
}
