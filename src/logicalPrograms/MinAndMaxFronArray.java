package logicalPrograms;

public class MinAndMaxFronArray {

    public static void main(String[] args) {
        int a[]= {10,30,20,45,12,35};

        int max=a[0];
        int min=a[0];
        for (int i=0; i<=a.length-1; i++)
        {
            if(max<a[i])
            {
               max=a[i] ;
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println(max+","+min);
    }
}
