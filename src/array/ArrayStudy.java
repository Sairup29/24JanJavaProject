package array;

import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {
        // dataType arrayName []= new dataType[size];    //array declaration
        String batters [] = new String[4];

        // array initialization
        batters[0]="rohit";
        batters[1]="virat";
        batters[2]="ishan";
        batters[3]="hardik";



       System.out.println(batters[0]);   //use
                          //3
        for(int i=0; i<=batters.length-1; i++)
        {
            System.out.println(batters[i]);
        }

        Arrays.sort(batters);
        for(int i=0; i<=batters.length-1; i++)   //ascending
        {
            System.out.println(batters[i]);
        }

        for(int i=batters.length-1; i>=0; i--)  //descending
        {
            System.out.println(batters[i]);
        }


    }



}
