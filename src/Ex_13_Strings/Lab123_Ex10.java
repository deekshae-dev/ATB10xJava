package Ex_13_Strings;

public class Lab123_Ex10 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Rohit");
        s1.append(" Sharma");
        System.out.println(s1.toString());

        String s2 = "beautiful";
        String s3 = "day";
        String s4 = s2 + s3;
        System.out.println(s2);
        System.out.println(s4);

    }
}
