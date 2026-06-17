package logicalPrograms;

public class sample4 {
    public static void main(String[] args) {
        String str = "webautomation testing";

        char[] ch = str.toCharArray();

        int totalDuplicates = 0;

        for (int i = 0; i < ch.length; i++)
        {

            // Skip already counted characters
            if (ch[i] == '1')
                continue;

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {

                    totalDuplicates++;
                    System.out.println(ch[j]);

                    // Mark duplicate character
                    ch[j] = '1';
                }
            }
        }
        System.out.println(totalDuplicates);
    }
}