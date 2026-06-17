package logicalPrograms;

public class Sample2 {
    public static void main(String[] args) {



     //=============================================================================================
        String s="velocity Pune testing"; //print in reverse order

      //testing Pune velocity

        String [] a=s.split(" ");
        String b= "";

        for(int i=a.length-1; i>=0; i--)
        {
             b=b+a[i]+" ";
        }

        System.out.println(b);
    }
}
