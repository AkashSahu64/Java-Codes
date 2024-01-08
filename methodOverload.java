public class methodOverload {
    static void akash(){
        System.out.println("Good Morning  Akash");
    }
    static void akash(int mark){
        System.out.println("your mark is : "+mark);
    }
    static void akash(int a,int b){
        int c;
        c=a+b;
        System.out.println("The sum of a+b is : "+c);
    }

    public static void main(String[] args) {
        akash();
        akash(98);
        akash(30,40);
    }
}
