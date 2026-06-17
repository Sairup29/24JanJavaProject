package encapsulation;

public class Demo {

   private int balance=10;

   public void deposit(int a)
   {
       balance=balance+a;
       System.out.println(balance);
   }

    public void withdraw(int b)
    {
        balance=balance-b;
        System.out.println(balance);
    }




}
