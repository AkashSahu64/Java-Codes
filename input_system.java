import java.util.Scanner;

public class input_system {
//    public static int calProduct(int a, int b){
//        int product = a * b;
//        return product;
//    }
public static void printFct(int n){
    if(n<0){
        System.out.println("invalid number");
        return;
    }
    int fact = 1;
    for(int i =n; i>=1; i--){
        fact = fact*i;
    }
    System.out.println(fact);
    return;
}
    public static void main(String[] args) {
//        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number : ");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number : ");
//        int b = sc.nextInt();
//        int sum = a+b;
//
//        System.out.println("The sum of the number is : ");
//        System.out.println(sum);
        //practice1
//        System.out.println("Enter your name :");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello " + name + " Have a Good Day !");
        //Practice 2
//        System.out.println("Enter your number :");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of row : ");
//        int row = sc.nextInt();
//        System.out.print("Enter the number of column : ");
//        int col = sc.nextInt();
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
//}

//import java.util.Scanner;
//        public class patern2{
//            public static void main(String[] args){

//                System.out.print("Enter the value of n : ");
//                int n = sc.nextInt();
//                //    System.out.print("Enter the number of column : ");
//                //     int col = sc.nextInt();
//                for(int i=n; i>=n; i--){
//                    for(int j=1; j<=i; j++){
//                        System.out.print("*");
//                                }
//                    System.out.print("\n");
//                }
//            }
//        }
//

//        String var = "Saurabh";
//
//
//        switch (var) {
//            case "Shubham" -> {
//                System.out.println("You are going to become an Adult!");
//                System.out.println("You are going to become an Adult!");
//                System.out.println("You are going to become an Adult!");
//            }
//            case "Saurabh" -> System.out.println("You are going to join a Job!");
//            case "Vishaka" -> System.out.println("You are going to get retired!");
//            default -> System.out.println("Enjoy Your life!");
//        }
//        System.out.println("Thanks for using my Java Code!");

//        System.out.print("Enter the value of a : ");
//        int a = sc.nextInt();
//        System.out.print("Enter the value of b : ");
//        int b = sc.nextInt();
//        int product = calProduct(a,b);
//        System.out.println("The product of the numbers is : "+product);

        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        printFct(n);
    }
}