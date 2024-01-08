import java.util.Scanner;
public class Employee{
    public static void main(String[] args){
        Scanner akash = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        String name = akash.nextLine();
        System.out.println("Enter your age: ");
        int age = akash.nextInt();
        if(age > 60){
            try {
                throw new GreaterAge();
            }
            catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }
}
class GreaterAge extends Exception{
    public String toString(){
        return "Age is Greater than 60";
    }
}
