public class varargs {
    static int sum(int ...arr){
        int result = 0;
//        static int sum(int n,int ...arr){
//            int result = n;
        for(int element : arr){
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of nothing is : "+sum());
//        System.out.println("the sum of nothing is : "+sum(3));
        System.out.println("the sum of a is : "+sum(4));
        System.out.println("the sum of a and b is : "+sum(4,5));
        System.out.println("the sum of a , b and c is : "+sum(4,5,7));
        System.out.println("the sum of a ,b,c and d is : "+sum(4,5,7,8));
    }

}
