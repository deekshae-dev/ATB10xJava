package Ex_9_SwitchCondition;

public class Lab087_Switch5 {
    public static void main(String[] args){

        int itemcode = 001;
        switch (itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default  -> System.out.println("default");

            //-> it is the shortcut for break//jdk 13
        }

    }
}
