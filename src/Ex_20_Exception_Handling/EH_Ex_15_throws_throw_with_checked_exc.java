package Ex_20_Exception_Handling;

//import java.io.IOException;
import java.io.*;

public class EH_Ex_15_throws_throw_with_checked_exc {
    public static void main(String[] args) throws InterruptedException {
        try {
            openFile("C:/Users/DEEPTHI/Desktop/abc.txt");
        } catch (IOException e) {
            System.out.println("Caught the IOException:" +e.getMessage());
        }
    }

    static void openFile(String fileName) throws IOException {
        throw new IOException("File not found: " + fileName);
    }
}
