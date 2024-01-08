
public class Hierical_inheritance {
    public static void main(String[] args) {
        Child3 c = new Child3(4,5);

    }
}
class Base2{
    int data;
    Base2(){
        int data = 10;
        System.out.println("Default constructor ! ");
    }
    Base2(int x){
        data = x;
        System.out.println("I am constructor with two parameter ! "+x);
    }

}
class Child2 extends Base2{
    Child2(){
        System.out.println("I am child of base2");
    }
}
class Child3 extends Base2{
    Child3(int x, int y){
        super(x);
        System.out.println("I am also Child of base2 "+x+ " and "+y);
    }
}

