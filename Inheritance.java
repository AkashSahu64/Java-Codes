public class Inheritance {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.data = 10;
        obj.x = 20;
        obj.display();
        obj.show();
    }
}
class Base{
    int data;
    void display(){
        System.out.println("Data : "+data);
    }
}
class Derived extends Base{
    int x;
    void show(){
        System.out.println(x);
    }
}
//class Base{
//    int data;
//    void display(){
//        System.out.println("Data : "+data);
//    }
//}
//
//public class Inheritance extends Base {
//    int data;
//    public static void main(String[] args) {
//        Base obj = new Base();
//        obj.data = 10;
//        obj.display();
//    }
//}
