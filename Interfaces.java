public class Interfaces {
    public static void main(String[] args) {
        show s = new show();
        s.display();
        s.show();
    }
}
interface inter{
    void display();
}
interface disaable{
    void show();
}
class show implements inter,disaable{
    public void display(){
        System.out.println("Hello Akash !");
    }
    public void show() {
        System.out.println("Hello Show function");
    }
}
