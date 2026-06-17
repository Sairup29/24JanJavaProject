package logicalPrograms;

public class sample12 {
    public static void main(String[] args) {
        String a="webautomation testing";
        char b[]=a.toCharArray();
        int count=0;

        for(int i=0; i<=b.length-1; i++)
        {
            for (int j = i + 1; j <= b.length - 1; j++)
            {
                if (b[i] == b[j])
                {
                    System.out.println(b[i]);
                    count++;

                }
            }
        }

        System.out.println(count);
    }
}
