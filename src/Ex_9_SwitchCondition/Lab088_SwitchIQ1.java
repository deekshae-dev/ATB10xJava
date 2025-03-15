package Ex_9_SwitchCondition;

public class Lab088_SwitchIQ1 {
    public static void main(String[] args) {
        int a = 11;
        //this is there just to confuse us not to be considered

        switch (-1) {
            default:
                System.out.println("default");
                break;
            case -1:
                System.out.println("10");
            case 9:
                System.out.println("9");
        }
    }
}
