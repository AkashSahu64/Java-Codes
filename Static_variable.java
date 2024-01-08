import java.util.Scanner;
public class Static_variable {
    int n;
    static int c;
    Static_variable(int n){
//       n = 10;
        this.n=n;
        c++;
    }
    void display(){

        System.out.println("Data = "+n+" and count = "+c);
    }

    public static void main(String[] args) {
//        Scanner akash = new Scanner(System.in);
//        System.out.println("Enter the value of n : ");
//        int n = akash.nextInt();
        Static_variable a = new Static_variable(5);
        a.display();
//        Static_variable b = new Static_variable();
//        b.display();
//        Static_variable c = new Static_variable();
//        b.display();
//        c.display();
    }
}
