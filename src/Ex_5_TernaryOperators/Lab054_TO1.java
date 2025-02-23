package Ex_5_TernaryOperators;

public class Lab054_TO1 {
    public static void main(String[] args){
        int age = 18;
        int oldage = 50;
        String canIVote = age >= 18 ? "Yes, you can vote" : "No,You cant vote";
        String urOld = oldage > 50 ? "Yes,you are old" : "No,you are not old";
        System.out.println(urOld);
        System.out.println(canIVote);

    }
}
