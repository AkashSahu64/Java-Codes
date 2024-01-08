public class Polymorphism {
    public static void main(String[] args) {
        Alpha3 r = new Alpha3();
        Beta2 b = new Beta2();
        Gama g = new Gama();
        r = b;
        r.show();
        b.show();
        g.show();
    }
}
class Alpha3{
    void show(){
        System.out.println(1);
    }
}
class Beta2 extends Alpha3{
    void show(){
        System.out.println(2);
    }
}
class Gama{
    void show(){
        System.out.println(3);
    }
}