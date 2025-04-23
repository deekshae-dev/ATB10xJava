package Ex_20_Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

public class EH_Ex_11 {

    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("C:/Users/DEEPTHI/Desktop/abc.txt");
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
