import java.util.Scanner;
public class Exception_Handling {
//    public static double area(int r) throws NegativeRadius{
//        if(r<0){
//            throw new NegativeRadius();
//        }
//        double result = Math.PI*r*r;
//        return result;
//    }
    public static void main(String[] args) {
//        int a = 512;
//        int b = 0;
////        ArithmeticException
//        try {
//            int c  = a/b;
//            System.out.println("Result : "+c);
//        }
//        catch (Exception e) {
//            System.out.println("Exception Handle is possible. Reason : " + e);
//        }

//        int [] arr = {34,77,22,78,98};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the array of index: ");
//        int i = sc.nextInt();
//        System.out.print("Enter any number to divide: ");
//        int n = sc.nextInt();
//        try{
//            System.out.println("The value of array of index is : "+arr[i]);
//            System.out.println("The Dividing Result is : "+arr[i]/n);
//        }
//        catch (ArrayIndexOutOfBoundsException a){
//            System.out.println("Exception Occure ! Reason: "+a);
//        }
//        catch (ArithmeticException ar){
//            System.out.println("Exception Occure ! Reason: "+ar);
//        }
//        catch (Exception e){
//            System.out.println("Exception Occure ! Reason: "+e);
//        }

            int r = -2;
            if (r < 0) {
                try {
                    throw new NegativeRadius();
                }
                catch (Exception e){
                    System.out.println(e.toString());
                    System.out.println(e.toString());
                }
//                throw new NegativeRadius();
//
//                double result = Math.PI * r * r;
//                return result;
            }
//            try{
//                double ar = area(3);
//                System.out.println(ar);
//            }
//            catch (Exception e) {
//                System.out.println("Exception is removed" + e);
//            }
        }
    }

class NegativeRadius extends Exception{
    public String toString(){
        return "Radius can not be negative";
    }
    public String getString(){
        return "Radius can not be negative";
    }
}
