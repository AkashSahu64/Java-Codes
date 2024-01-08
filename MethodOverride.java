public class MethodOverride {
    public static void main(String[] args) {
        Over o = new Over();
        o.meth2();
        SubOver s = new SubOver();
        s.meth3();
        Over d = new SubOver();    // This is called dynamic method dispatch
        d.meth2();
        d.call();
        d.meth3();
//        d.clroom();
    }
}
class Over{
    int a;
    int meth1(){
        return 1;
    }
    void meth2(){
        System.out.println("Hello i am meth 2 of class over");
    }
    void meth3()
    {
        System.out.println("I am meth 3 of class over");
    }
    void call(){
        System.out.println("Calling a person who is present in class over ");
    }
}
class SubOver extends Over{
    void meth2(){
        System.out.println("Hello I am meth 2 of class subover");
    }
    void meth3 (){
        System.out.println("Hello I am meth3 of class subover");
    }
    void clroom(){
        System.out.println("I am going to classroom");
    }
}
