import java.util.Scanner;
public class recursion {
    static int recur(int n){
        if(n==1 || n==0){
            return 1;
        }else {
            return n * recur(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner akash = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = akash.nextInt();
        System.out.println("The factorial of "+n+" is : " +recur(n));

    }
}
