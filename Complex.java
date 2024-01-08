import java.util.Scanner ;

public class Complex {
    int real;
    int img;
    Complex(){
        System.out.println("Default");
        real = 0;
        img = 0;
    }
    Complex(int r, int i){
        System.out.println("With 2 parameter");
        real = r;
        img = i;
    }
    Complex(int v){
        System.out.println("With one argument");
        real = v;
        img = v;
    }
    Complex(Complex obj){
        System.out.println("With a comlex object");
        real = obj.real;
        img = obj.img;
    }

    void display(){

        System.out.println(real+"+"+img+"i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(5,3);
        c1.display();
        Complex c2 = new Complex(c1);
        c2.display();
        Complex c3 = new Complex();
        c3.display();
    }
}
