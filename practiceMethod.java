import java.util.Scanner;
public class practiceMethod {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }

    static int recAdd(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return recAdd(n - 1) + recAdd(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
        Scanner akash = new Scanner(System.in);
        int n = akash.nextInt();
//        multiplication(n);
        int result = recAdd(n);
        System.out.println("The value of fibbonacai series is : "+result);
    }
}
