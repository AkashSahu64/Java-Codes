import java.util.Scanner;
public class Complex_Num {
    int real;
    int img;
    Complex_Num(){
        real = 0;
        img = 0;
    }
    Complex_Num(int r, int i) {
        real = r;
        img = i;
    }
    void incr() {
        real = real + 1;
        img = img +1;
    }
    void setData(int r, int i){
        real = r;
        img = i;
    }
    Complex sum(Complex_Num n) {
//        Complex t = new Complex();
        int x = real + n.real;
        int y = img + n.img;
        return new Complex(x,y);
    }
    Complex multiply(Complex_Num n) {
        Complex x = new Complex();
        x.real =real*n.real;
        x.img =img*n.img;
        return x;
    }
    public void display() {
        System.out.println(real + "+" +img+"i");
    }
    public static void main(String[] args) {
        Complex_Num cn = new Complex_Num();
        Scanner akash = new Scanner(System.in);
        System.out.print("Enter the value of r : ");
        int r = akash.nextInt();
        System.out.print("Enter the value of i : ");
        int i = akash.nextInt();
        Complex_Num c1 = new Complex_Num(r,i);
        System.out.print("Enter the value of r2 :");
        int r2 = akash.nextInt();
        System.out.print("Enter the value of i2 : ");
        int i2 = akash.nextInt();
        Complex_Num c2 = new Complex_Num(r2,i2);
        while (true){
            System.out.println("1.Complex variable 2. Increment 3. Sum");
        System.out.print("Enter your choice : ");
        int ch = akash.nextInt();
        switch (ch){
            case 1:
                System.out.print("The complex variable is : ");
                c1.display();
                System.out.print("Enter the value of a: ");
                int a = akash.nextInt();
                System.out.print("Enter the value of b: ");
                int b = akash.nextInt();
                System.out.print("Your setData is: ");
                cn.setData(a,b);
                cn.display();
                break;
            case 2:
                c1.incr();
                System.out.print("The increment of the complex is : ");
                c1.display();
                break;
            case 3:
                Complex c3;
                c3= c1.sum(c2);
                System.out.print("The sum of the complex is : ");
                c3.display();
                break;
            case 4:
                Complex c5;
                System.out.print("Enter the value of r1 : ");
                int r1 = akash.nextInt();
                System.out.print("Enter the value of i2 : ");
                int i1 = akash.nextInt();
                Complex_Num c4 = new Complex_Num(r1,i1);
                c5= c4.multiply(c2);
                System.out.print("The multiplication of the complex is : ");
                c5.display();
                break;
            default:
                System.out.println("Enter valid number !");
        }
            System.out.print("\nDo you want to continue : (1/0): ");
            int choice = akash.nextInt();
            if (choice == 0) {
                break;
            }
        }
    }
}

