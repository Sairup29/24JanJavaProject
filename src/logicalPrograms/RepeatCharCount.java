package logicalPrograms;

public class RepeatCharCount {
    public static void main(String[] args) {
        //blank space,repeat char count in a string
        String a="engi neer ing ojh";   //3 //2
        int count=1;
                        //10
        for(int i=0; i<=a.length()-1; i++)
        {
            char b=a.charAt(i);
            if(b==' ')
            {
                count++;  //3
            }

        }
        System.out.println(count);
    }
}
//string,conditional,loop,array