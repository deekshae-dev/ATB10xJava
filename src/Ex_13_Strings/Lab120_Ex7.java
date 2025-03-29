package Ex_13_Strings;

public class Lab120_Ex7 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s5));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }

}
