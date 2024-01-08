import java.util.Scanner;
public class This_kw {
    int real;
    int img;


     This_kw(int real, int img){
        this.real = real;
        this.img = img;
    }
    This_kw twice(){
        this.real = this.real*2;
        this.img = this.img*2;
        return this;
    }
    void add(This_kw n){
        real = real+n.real;
        img = img+n.img;
    }
    Complex sum(This_kw n){
        Complex t = new Complex();
        t.real = real+n.real;
        t.img = img+n.img;
        return t;
    }
    void display(){
        System.out.println(real+"+"+img+"i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of real part of complex : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of real part of complex : ");
        int b = sc.nextInt();
        This_kw c = new This_kw(a,b);
        This_kw c2;
        This_kw c3 = new This_kw(5,6);
        Complex c4;
        System.out.println("Setting data of complex");
//        c.twice(a,b);
//        c.display();
        System.out.println("Twice the complex element ");
//        c2= c.twice();
//        c.display();
        System.out.println("Add two complex ");
//        c3.add(c);
//        c3.display();
        System.out.println("Sum of complex");
        c4 = c3.sum(c);
        c4.display();

    }
}
