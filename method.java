public class method {
//    static int logic(int x, int y){
    int logic(int x, int y){
        int z;
        if(x > y){
            z = x+y;
        }
        else {
            z = x-y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 32;
        int c;
        method obj = new method();
        c = obj.logic(a,b);
//        c = logic(a,b);
        int d = 40;
        int e = 15;
        int f;
        f = obj.logic(d,e);
//        f = logic(d,e);
        System.out.println(c);
        System.out.println(f);

    }
}
