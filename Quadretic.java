import java.util.*;
public class Quadretic {
    double a;
    double b;
    double c;
    Quadretic(double x1, double y1, double z1) {
        a = x1;
        b = y1;
        c = z1;
    }
    void display() {

        System.out.println(a + "X^2 + " + b + "X + " + c);
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Discriminant of the equation is : ");
        System.out.println(discriminant);
        System.out.println("The Root of quadratic equation is : ");
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
        if (discriminant > 0) {
            root1 =(-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("Roots are real and equal: " + root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(discriminant) / (2 * a);
            System.out.println("Roots are complex and different: " + realPart +
                    " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }
    }
    public static void main(String[] args) {
        Scanner akash = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a = akash.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = akash.nextDouble();
        System.out.println("Enter the value of c : ");
        double c = akash.nextDouble();
        Quadretic k = new Quadretic(a,b,c);
        k.display();

    }
}
