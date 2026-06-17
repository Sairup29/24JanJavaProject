package array;

public class ArrayStudy3 {

    public static void main(String[] args) {
                        //0               //1
        char div[][]={{'a','b','c','g'},{'d','e','f','e'}};

//        System.out.println(div[0][0]);
                         //2
        for(int i=0; i<=div.length-1; i++)
        {
            for(int j=0; j<=div[0].length-1; j++)
            {
                System.out.print(div[i][j]+" ");
            }
            System.out.println();
        }

//        'a','b','c',
//        'd','e','f'
//        'a','b','c'
//        'd','e','f'

    }
}
