public class Interface_polymorphism {
    public static void main(String[] args) {
        Bike b = new Biker();
        b.start();
        b.stop();
//        b.speed();
        Biker bi = new Biker();
        bi.bikeModel();
        bi.speed();
        bi.bikeNumber(203);
    }
}
interface Bike{
    void start();
    void stop();
}
interface Model{
    String[] bikeModel();
    void chooseModel(String modelName);
}
class MyBike{
    void bikeNumber(int num){
        System.out.println("My bike number is : "+num);
    }
    void speed(){
        System.out.println("Move to normal Speed");
    }
}
class Biker extends MyBike implements Bike,Model{
    @Override
    public void start() {
        System.out.println("Bike Started....");
    }

    @Override
    public void stop() {
        System.out.println("Bike is Stopped...");
    }

    @Override
    public String[] bikeModel() {
        System.out.println("The list of Bike Model : ");
        String [] BM = {"Honda","Hero","Discover","KTM","TVS"};
        return BM;
    }

    @Override
    public void chooseModel(String modelName) {
        System.out.println("The Bike Model "+modelName);
    }
}
