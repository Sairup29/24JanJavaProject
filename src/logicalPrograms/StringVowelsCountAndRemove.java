package logicalPrograms;

import java.util.Scanner;

public class StringVowelsCountAndRemove {

    public static void main(String[] args) {
//       String s="engineering";    //3
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.next();

        String s1=s.toLowerCase();
        int count=0;
        String s2="";

        for(int i=0; i<=s1.length()-1; i++)
        {
            char c=s1.charAt(i);  //0
            if(c==' ')
            {
                System.out.println(c);
                count++;

                continue;
            }

            s2=s2+c;  //v

        }

        System.out.println(count);
        System.out.println(s2);

    }
}
