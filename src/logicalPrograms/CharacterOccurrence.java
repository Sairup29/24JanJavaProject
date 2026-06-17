package logicalPrograms;

public class CharacterOccurrence {
        public static void main(String[] args) {

            String name = "engineering";

            for (char ch = 'A'; ch <= 'z'; ch++)
            {
                int count = 0;

                for (int i = 0; i <= name.length()-1; i++)
                {

                    if (name.charAt(i) == ch)
                    {
                        count++;
                    }
                }

                if (count > 0)
                {
                    System.out.println(ch + " " + count);
                }
            }
        }
    }

