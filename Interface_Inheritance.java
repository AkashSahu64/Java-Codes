public class Interface_Inheritance {
    public static void main(String[] args) {
        sampleClass obj = new sampleClass();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
interface Sample{
    void display1();
    void display2();
}
interface SimpleChild extends Sample{
    void display3();
}
class sampleClass implements SimpleChild{
    public void display1(){
        System.out.println("I am meth1");
    }

    @Override
    public void display2() {
        System.out.println("I am meth2");
    }

    @Override
    public void display3() {
        System.out.println("I am meth3");
    }
}
