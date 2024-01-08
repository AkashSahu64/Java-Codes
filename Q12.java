import java.io.*;

public class Q12{
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter text to write to the file: ");
            String input = reader.readLine();

            FileOutputStream fos = new FileOutputStream("buffer.txt");
            byte[] data = input.getBytes();
            fos.write(data);

            fos.close();
            System.out.println("Text written to the file successfully using FileStream.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
