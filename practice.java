import java.util.Scanner;
import java.util.SortedMap;

public class practice {
    public static void main(String[] args) {
//        int a = 10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your physics marks :");
//        float physics = sc.nextFloat();
//        System.out.println("Enter your chemistry marks :");
//        float chemistry = sc.nextFloat();
//        System.out.println("Enter your math marks :");
//        float math = sc.nextFloat();
//
//        float avg = (physics+chemistry+math)/3;
//        System.out.println("Overall precentage is :" +avg);
//        if(avg>=40 && physics>=33 && chemistry>=33 && math>=33){
//            System.out.println("Congratulations ! You are pass");
//        }
//        else {
//            System.out.println("Sorry! you are fail ");
//        }

        // practice 2
//        System.out.println("This is not a website");
//        } System.out.println("Enter your website name |:");
//        String website = sc.next();
//
//        if(website.endsWith(".com")){
//            System.out.println("This is a commercial website");
//        }
//        else if (website.endsWith(".org")) {
//            System.out.println("This is a Organisational website");
//        }
//        else if (website.endsWith(".in")) {
//            System.out.println("This is a Indian website");
//        }

//        practice 3

//        System.out.println("Enter the value of n :");
//        int n = sc.nextInt();
//
//        for(int i=n; i>0; i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//
//            }
//            System.out.println("");
//        }
        //Practice 4

//        System.out.println("Enter the value of n :");
//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i=0; i<n; i++){
//            if(i%2==0){
//                System.out.println(i);
//                sum = sum+i;
//            }
//            //sum = sum +(2*i);
//        }
//        System.out.print("The sum of the even number is :");
//        System.out.println(sum);
        //Practice 5

//        System.out.println("Enter the value of arr :");
//        int [] arr = new int[]{sc.nextInt()};
//        int fact = 1;
//        for(int i=1; i<=n; i++){
//            fact=fact*i;
//          //System.out.println(fact);
//
//        }
//        System.out.println(fact);
//        System.out.println("Enter the value of n : ");
//        int n = sc.nextInt();
//        for(int element : arr){
//            if(n == element){
//                System.out.println("Number is present in the array");
//            }else {
//                System.out.println("Number is not present in the array");
//            }
//            System.out.println(element);
//        }

//        float [] arr = {6.3f, 5.4f,23.5f,33,54.6f};
//        float result = 0;
//        float x = 5.4f;
////        for (float i: arr){
//        for (float i:arr){
////            result = result + i;
////            System.out.println(result);
//            if (x == i){
//                System.out.println("The floting number is present in the array");
//            }
//            else {
//                System.out.println("Number is not present in the array");
//            }
//        }
////        System.out.println(result);
//        int arr[] = {29, 83,74};
//        int result = 0;
//        int avg;
//        for (int i:arr){
//            result = result+i;
//        }
//        avg = result/arr.length;
//        System.out.println(avg);


//        int [][] mat1 = {{2,4,5},{3,6,3}};
//        int [][] mat2 = {{6,5,3},{5,6,3}};
//        int [][] mat = {{0,0,0},{0,0,0}};
//        for (int i = 0; i<mat1.length; i++){
//            for (int j = 0; j<mat1[i].length; j++){
//                mat[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(mat[i][j]+" ");
//            }
//            System.out.println("");
//        }

//        int []arr = {1,2,4,5,6,7};
//        int l = arr.length;
//        int mid = l/2;
//        for (int i = 0; i<mid; i++){
//            int t = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = t;
//        }
//        for (int i = 0; i<arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        int []arr = {34,4,23,67,675,644,986,43,222};
        int max = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
        }
        }
        System.out.println(max);
    }
}
