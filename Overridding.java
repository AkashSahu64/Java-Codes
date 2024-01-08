public class Overridding {
    public static void main(String[] args) {
      Alpha1 a= new Alpha1();
      a.display(3);
    }
}
class Alpha1{
    void display(){
        System.out.println("Default");
    }
    void display(int x){
        System.out.println("With one parameter "+x);
    }
}
