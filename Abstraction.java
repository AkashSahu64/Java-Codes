public class Abstraction {
    public static void main(String[] args) {
        Child_Abs b = new Child_Abs();
        b.show();
        b.display();
//        Abs a = new Abs();
    }
}
abstract class Abs{
    abstract void show();
    void display(){
        System.out.println("This is abstraction ");
    }
}
class Child_Abs extends Abs{
    void show(){
        System.out.println("This is Childbs");
    }
}

