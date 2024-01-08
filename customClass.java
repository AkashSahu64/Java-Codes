
public class customClass {
    public static void main(String[] args) {
        Student akash = new Student();
        Student shivam = new Student();
        akash.rollNo = 8;
        shivam.rollNo = 56;
//        akash.name = "Akash";
//        shivam.name = "Shivam";
        System.out.println(akash.name);
        System.out.println(akash.rollNo);

    }
}
class Student{
    int rollNo;
    String name;
//    public void Display(){
//        System.out.println("My roll number is :"+rollNo);
//        System.out.println("My name is : "+name);
//    }
}
