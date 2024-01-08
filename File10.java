import java.io.FileInputStream;
import java.io.IOException;
public class File10 {
    public static void main(String[] args) {
        try {
        FileInputStream fis = new FileInputStream("aks.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
