package Ex_13_Strings;

public class Lab121_Ex8 {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        String s1 = "Hello";
        String s2 = s1.concat("World");
        System.out.println(s2);

    }
}
