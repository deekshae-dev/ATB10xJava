package ex_2_JavaBasic;

public class Lab024_LiteralEx2 {
    public static void main(String[]args){

        char c1 = 'c';
        char c2 = 'd';

        char new_line = '\n';
        char tab_line = '\t';
        char backspace = '\b';
        char car_r = '\r';

        System.out.println("car" +new_line + "blue");
        System.out.println("welcome" +tab_line + "home");
        System.out.println("best" +backspace+ "car");
        System.out.println("child" +car_r+ "friendly");
        //these are the escape characters
        char c11 = '\u1F60';
        System.out.println(c11);
        //this is a uni-code character

        System.out.println();
    }
}
