public class Cunstructor_Inheritance {
    public static void main(String[] args) {
//        Base1 obj = new Base1();
        Dbase1 s = new Dbase1(5,6);
        Child c = new Child(2,5,7);
        s.display();
//        obj.display();
        System.out.println(s.data);
//        System.out.println(obj.data);
    }
}
class Base1{
    int data;
    Base1(){
        data = 10;
        System.out.println("Default cunstructor");
    }
    Base1(int x){
        data = x;
        System.out.println("With one parameter !" +x);
    }
    void display(){
        System.out.println("Data : "+data);
    }
}
class Dbase1 extends Base1{
    Dbase1(){
        super(5);
        System.out.println("I am constructor od Dbase1");
    }
    Dbase1(int y){
        super(y);
        System.out.println("I am second constructor : "+y);
    }
    Dbase1(int x, int y){
        super(x);
        System.out.println(y);
        System.out.println(x);
    }
}
class Child extends Dbase1{
    Child(int x,int y, int z){
        super(x,y);
        System.out.println("I am child of Dbase1 : "+y+" "+z);
    }
}
