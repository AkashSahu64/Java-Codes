
import java.util.*;
public class MathClassMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of y : ");
        double y = sc.nextDouble();
        System.out.println("Enter the value of a : ");
        double a = sc.nextDouble();
        double b = Math.toDegrees(a);
//        double b = Math.toRadians(a);
        System.out.print("The squre root of x is : "+Math.sqrt(x));
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));
        System.out.println("Square root of y is: " + Math.sqrt(y));
        System.out.println("Power of x and y is: " + Math.pow(x, y));
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));
        System.out.println("log1p of x is: " +Math.log1p(x));
        System.out.println("exp of a is: " +Math.exp(x));
        System.out.println("expm1 of a is: " +Math.expm1(x));
        System.out.println("Sine value of a is: " +Math.sin(a));

        System.out.println("Cosine value of a is: " +Math.cos(a));
        System.out.println("Tangent value of a is: " +Math.tan(a));
        System.out.println("Sine value of a is: " +Math.asin(a));
        System.out.println("Cosine value of a is: " +Math.acos(a));
        System.out.println("Tangent value of a is: " +Math.atan(a));
        System.out.println("Sine value of a is: " +Math.sinh(a));
        System.out.println("Cosine value of a is: " +Math.cosh(a));
        System.out.println("Tangent value of a is: " +Math.tanh(a));
    }
}
