package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowAndThrows {

      public static void m1() throws FileNotFoundException
      {
          FileInputStream file = new FileInputStream("xyz");
      }

    public static void main(String[] args) {
        int age =10;

        try
        {
            if(age<20)
            {
                throw new InvalidAgeException("invalid age");
            }
            else
            {
                System.out.println("eligible for vote");
            }

        }
        catch (InvalidAgeException x)
        {
            System.out.println(x);
        }




    }
}
