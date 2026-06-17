package logicalPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //given is are anagram or not

        String a="velocity";
        String b= "citzeselo";

        char c[]=a.toCharArray();
        char d[]= b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        if(Arrays.equals(c,d))
        {
            System.out.println("anagrams");
        }
        else {
            System.out.println("not anagrams");
        }




    }
}
