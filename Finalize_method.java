public class Finalize_method {
    int data;
    Finalize_method(int x){
        data = x;
    }
    protected void finalizeed(){
        System.out.println("Object is destroyed");
    }

    public static <Finalize> void main(String[] args) {
        Finalize_method a = new Finalize_method(5);
//        Finalize_method b = new Finalize_method(10);{
//            Finalize_method c = new Finalize_method(6);
//            System.out.println("Block");
//        }
        a.finalizeed();

    }
}
