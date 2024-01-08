
class Students{
        private int roll_no;
        private String name;
        void setId(int i){
            roll_no = i;
        }
        int getId(){
            return roll_no;
        }
        void setName(String n){
            name = n;
        }
        String getName(){
            return name;
        }
    }
    public class Access_modifire {

    public static void main(String[] args) {
        Students a = new Students();
        a.setName("Akash Sahu");
        System.out.println(a.getName());
        a.setId(10);
        System.out.println(a.getId());
    }
}
