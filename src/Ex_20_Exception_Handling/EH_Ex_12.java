package Ex_20_Exception_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EH_Ex_12 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream  f = new FileInputStream("C:/Users/DEEPTHI/Desktop/abc.txt");
    }
}
