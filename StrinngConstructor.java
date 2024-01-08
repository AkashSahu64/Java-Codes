public class StrinngConstructor {
    public static void main(String[] args) {
        char ch[] = {'A','B','C','D','E','F'};
        String s = new String(ch);
        String s1 = new String();
        System.out.println(ch);
        System.out.println(s);
        String s2 = new String(ch,1,4);
        System.out.println(s2);
        byte a[] = {65,66,67,68,69,70};
        String s3 = new String(a);
        System.out.println(s3);
        String s4 = new String(a,2,3);
        System.out.println(s4);
        Dimention s5 = new Dimention(15,18,20);
        System.out.println(s5);

    }
}
class Dimention{
    double length;
    double bright;
    double hight;
    Dimention(double l, double b, double h){
        length = l;
        bright = b;
        hight = h;
    }
    public String toString(){
        return "Dimention are : "+length+" x "+bright+" x "+hight;
    }
}
