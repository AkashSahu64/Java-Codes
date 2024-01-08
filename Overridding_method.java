public class Overridding_method {
    public static void main(String[] args) {
       Beta b = new Beta();
       b.show();
    }
}
class Alpha2{
    final void show(){
        System.out.println("Show Alpha");
    }
}
class Beta extends Alpha2{
//    void show(){
//        super.show();
//        System.out.println("I am Beta");
//    }
}
