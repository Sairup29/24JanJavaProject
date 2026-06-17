package logicalPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        //check given string is palindrome or not
        String a="radar";
        String rev="";
        for (int i=a.length()-1; i>=0; i--)
        {
           char b=a.charAt(i);
           rev=rev+b;
        }

        if(a.equals(rev))
        {
            System.out.println("given string is palindrome");
        }
        else
        {
            System.out.println("given string is not a palindrome");
        }
    }
}
