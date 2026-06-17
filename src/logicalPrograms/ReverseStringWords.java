package logicalPrograms;

public class ReverseStringWords {

            public static void main(String[] args) {
                String a = "Velocity Testing Pune Mumbai Hyderabad";
                String b[] = a.split(" ");

                for (int i = 0; i <= b.length-1; i++)
                {
//                    if (i%2 == 0)
//                    {
                        String reversed = "";
                        String temp =b[i];

                        for (int j = temp.length() - 1; j >= 0; j--)
                        {
                            reversed = reversed + temp.charAt(j);
                        }

                       b[i] = reversed;
//                   /
                }


                for (int i = 0; i <= b.length-1; i++)
                {
                    System.out.print(b[i] + " ");
                }





            }
        }


