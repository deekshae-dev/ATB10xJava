package Ex_13_Strings;

public class Lab124_Ex11 {
    public static void main(String[] args) {
      StringBuffer str = new StringBuffer("Rohit");
      str.append(" Agarwal");
      System.out.println(str);

      //reverse():
      str.reverse();
      System.out.println(str);

      StringBuilder str1 = new StringBuilder("Rohit");
      str1.append(" Shetty");
      System.out.println(str1);

      String s5 = "hi";
      String s6 = "hello";
      String s7 = s5 + s6;
      System.out.println(s7);
      System.out.println(s5);
    }
}
