package String;

public class Practices {
    public static void main(String[] args) {
        String s = "Welcome";
        String s1=" to java";
        System.out.println(s1);
        System.out.println(s.length()); //length of string
        System.out.println(s.concat(s1)); //joining two strings

        System.out.println(s1.trim());//triming the spaces, only for front and back spaces but not in middle

        System.out.println(s.charAt(3)); //character at given index

        System.out.println(s.contains("elco"));

        System.out.println(s.contains("weel"));

        System.out.println(s.equals(s1));

        System.out.println(s.equals("welcome")); //case sensitive

        System.out.println(s.equalsIgnoreCase("WELCOME"));

        System.out.println(s.contains("Welcome"));

        String s2 = s.concat(s1);
        System.out.println(s2);

        System.out.println(s.replace('e', 's'));

        System.out.println(s2.replace("java", "selenium"));

        String s3 = "RAJIB";
        System.out.println(s3.substring(2));
        System.out.println(s3.substring(2, 5));
        System.out.println(s3.toLowerCase());
        System.out.println(s1.toUpperCase());


    }
}
