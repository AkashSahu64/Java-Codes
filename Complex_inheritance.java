public class Complex_inheritance {
    public static void main(String[] args) {
        Child_complex c = new Child_complex(3,5);
        c.display();
        c.incr(2,4);
        c.display();
        Child_complex c1= new Child_complex(5,4);

    }
}
class Complex1{
    int real;
    int img;
    Complex1(){
        System.out.println("Default complex");
    }
    Complex1(int r, int i){
        real= r;
        img = i;
    }
    void display(){
        System.out.println(real+"+"+img+"i");
    }
}
class Child_complex extends Complex1{
    Child_complex(int r, int i){
        super(r,i);
    }
    public void incr(int r, int i) {
        real += r;
        img += i;
    }
        Child_complex twice(){
        this.real = this.real*2;
        this.img = this.img*2;
        return this;
    }
    Complex sum(Child_complex other) {
        int realSum = this.real + other.real;
        int imgSum = this.img + other.img;
        return new Complex(realSum, imgSum);
    }
//    Complex sum(Child_complex n) {
//        Complex t = new Complex();
//        t.real = real + n.real;
//        t.img = img + n.img;
//        return t;
//    }
    void subtaction(Child_complex n) {
        real = real - n.real;
        img = img - n.img;
    }
}