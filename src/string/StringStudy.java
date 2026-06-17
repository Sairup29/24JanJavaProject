package string;

public class StringStudy {
    public static void main(String[] args) {
        String a= "velocity";
        String b= "velocity";
        String c= new String("velocity");
        String d= new String("velocity");

        int a1=a.length();  // length= index+1
        System.out.println(a1);

        String a2=a.toUpperCase();
        System.out.println(a2);

        String a3=a.toLowerCase();
        System.out.println(a3);

        //equals compare data of a string
        boolean a4=a.equals(b);
        System.out.println(a4);

        boolean a5=a.equals(c);
        System.out.println(a5);

        //== compare the memory address of a string
        boolean a6=a==b;
        System.out.println(a6);

        boolean a7=a==c;
        System.out.println(a7);

        boolean a8=c==d;
        System.out.println(a8);

        boolean a9=a.startsWith("velo");
        System.out.println(a9);

        boolean b1=a.endsWith("city");
        System.out.println(b1);

        String e="";
        boolean b2=a.isEmpty();  //  Returns true if the string is either empty or contains only whitespace characters
        System.out.println(b2);

        boolean b3=e.isEmpty();
        System.out.println(b3);

        boolean b4=a.isBlank();
        System.out.println(b4);//  Returns true if the string is either empty or contains only whitespace characters

        boolean b5=e.isBlank();
        System.out.println(b5);

        String f="     ";
        boolean b6=f.isBlank();
        System.out.println(b6);

        boolean b7=a.contains("city");
        System.out.println(b7);

        char b8=a.charAt(4);
        System.out.println(b8);

        String b9=a.substring(3);
        System.out.println(b9);

        String c1=a.substring(3,7);
        System.out.println(c1);

       //String a= "velocity";
       String h= "engineering";
       int c2=a.indexOf('c');
       System.out.println(c2);

       int h2=h.lastIndexOf('i');
       System.out.println(h2);

       int h3=h.indexOf('e',5);
       System.out.println(h3);

//     String h4=h.replace('e','r');
//     System.out.println(h4);
       String h5=h.replaceFirst("e","r");
       System.out.println(h5);

       String h6=a.concat(h);
       System.out.println(h6);



  // two exceptions index out of bound and null pointer exception




    }
}
