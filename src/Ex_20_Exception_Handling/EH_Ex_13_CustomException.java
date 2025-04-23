package Ex_20_Exception_Handling;

public class EH_Ex_13_CustomException {
public static void main(String[] args) {
    Bank sbi = new Bank("INR",100);
    Bank icici = new Bank("INR", 200);
    Bank jp_chase = new Bank("USD", 100);
    int result1= sbi.add(jp_chase);
    int result = sbi.add(icici);//in add function we have passed the reference of icici
    System.out.println(result);
    System.out.println(result1);
}
}
