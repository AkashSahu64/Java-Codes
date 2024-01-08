import java.io.*;
public class FileExample {
    public static void main(String[] args) throws IOException {
//        try {
//        int i = 65;
            FileOutputStream fos = new FileOutputStream("Throw.java");
            fos.write(65);
            fos.close();
            System.out.println("Success..");
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
    }
}
