public class function {

    public static void main(String[] args) {
        Bird tota = new Bird();
        tota.fly(10);
        tota.notFly();

    }
}
class Bird{
    void notFly(){
        System.out.println("Bird is not flying");
    }
    void fly(int d){
        System.out.println("The bird fly "+d+" km");
    }
}