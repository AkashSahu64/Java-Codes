import java.util.Scanner;
class Circle1 {
    private double radius;
    Circle1(double radius) {
        this.radius = radius;
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Scanner akash = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double r = akash.nextDouble();
        Circle1 c = new Circle1(r);
        while (true){
        System.out.print("Enter your choice : 1. Circumference 2. Area : ");
        int ch = akash.nextInt();
        switch (ch){
            case 1:
                System.out.println("Radius = " + c.radius);
                System.out.println("The Circumference of the circle is : "+c.circumference());
                break;
            case 2:
                System.out.println("The area of the circle is : ");
                System.out.println("Radius = " + c.radius);
                System.out.println("The area of the circle is : "+c.area());
                break;
            default:
                System.out.println("Please enter valid number !");
        }
            System.out.print("\nDo you want to continue : (1/0): ");
            int choice = akash.nextInt();
            if (choice == 0) {
                break;
            }
        }
    }
}


