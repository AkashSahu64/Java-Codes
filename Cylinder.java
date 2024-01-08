import java.util.Scanner;
public class Cylinder {
    double redius;
    double hight;
    Cylinder(double r, double h){
        redius = r;
        hight = h;
    }
    void Valume(){
           double r = redius;
           double h = hight;
        double val = Math.PI*r*r*h;
        System.out.print("The valume of a cylinder is : "+val);
    }
    void Area(){
        double r = redius;
        double h = hight;
        double a = Math.PI*r*(r+h);
        System.out.print("The surface area of a cylinder is : "+a);
    }
    void Lateral_area(){
        double r = redius;
        double h = hight;
        double la = 2*Math.PI*r*h;
        System.out.print("The lateral area of a cylinder is : "+la);
    }
    void Base_area(){
        double r = redius;
        double h = hight;
        double ba = Math.PI*r*r;
        System.out.print("The base area of a cylinder is : "+ba);
    }
    void totalSurfaceArea() {
        double r = redius;
        double h = hight;
        double baseArea = Math.PI*r*(r+h);
        double curvedArea = 2*Math.PI*r*h;
        double totalArea = 2 * baseArea + curvedArea;
        System.out.print("Total surface area = " + totalArea);
    }
    public static void main(String[] args) {
        Scanner akash = new Scanner(System.in);
        System.out.print("Enter the value of r : ");
        double r = akash.nextDouble();
        System.out.print("Enter the value of h : ");
        double h = akash.nextDouble();
        Cylinder c = new Cylinder(r,h);
        while (true){
        System.out.print("Enter your choice : ");
        int ch = akash.nextInt();
        switch (ch) {
            case 1:
                c.Valume();
                break;
            case 2:
                c.Area();
                break;
            case 3:
                c.Lateral_area();
                break;
            case 4:
                c.Base_area();
                break;
            case 5:
                c.totalSurfaceArea();
                break;
            default:
                System.out.println("Enter valid number !");
        }
            System.out.print("\nDo you want to continue : (1/0): ");
            int choice = akash.nextInt();
            if (choice == 0) {
                break;
            }
        }
    }
}
