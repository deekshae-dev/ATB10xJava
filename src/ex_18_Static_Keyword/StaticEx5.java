package ex_18_Static_Keyword;

public class StaticEx5 {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
        //we can change the value of the static variable
        Automation.driver = "Firefox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);
    }
}

class Automation {
    static String driver = "Chrome";
    static String driver2;
    //Static variable compulasarily need not be initialized
    //when we don't initialize the value would be null
}