package array;

public class ArrayStudy2 {

    public static void main(String[] args) {

        int marks[][]=new int[2][2];

        marks[0][0]=1;                                //
        marks[0][1]=2;
        marks[1][0]=3;
        marks[1][1]=4;
//        marks[3][4]=39;
//        System.out.println(marks[0][1]);
                        //1
        for(int i=0; i<=marks.length-1; i++)
        {                 //1
            for(int j=0; j<=marks.length-1; j++)
            {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }


    }
}
