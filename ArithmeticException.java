import java.util.Scanner;
public class ArithmeticException {
    public static void main(String[] args) {
        Scanner akash = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = akash.nextInt();
        System.out.println("Enter the value of b: ");
        int b = akash.nextInt();
        try {
            int c = a/b;
            System.out.println("The result of a/b is: "+c);
        }catch (Exception e){
            System.out.println("We can not divide by zero");
            System.out.println("The reason is: "+e);
        }
    }
}
