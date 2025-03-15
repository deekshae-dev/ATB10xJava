package Ex_9_SwitchCondition;

public class Lab086_Switch4 {
    public static void main(String[] args){
        int itemcode = 003;
        switch(itemcode){
            case 001,002,005:
                System.out.println("electronic gadgets");
                break;
            case 004,006,007:
                System.out.println("this is mech");
                break;
            default:
                System.out.println("none");
        }

    }
}
