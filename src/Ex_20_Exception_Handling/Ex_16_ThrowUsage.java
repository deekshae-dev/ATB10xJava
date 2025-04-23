package Ex_20_Exception_Handling;

public class Ex_16_ThrowUsage {
    static void validate_age(int age) {
        if(age < 18) {
            try {
                throw new Exception("Age cannot be less than 18");  //manual exception
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        validate_age(15);
    }
}
